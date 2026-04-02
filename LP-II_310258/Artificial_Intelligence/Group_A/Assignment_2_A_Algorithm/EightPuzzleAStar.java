package Group_A.Assignment_2_A_Algorithm;
import java.util.*;

public class EightPuzzleAStar {
    static class PuzzleNode {
        int[][] board;
        int blankRow, blankCol;
        int cost, heuristic, totalCost;
        PuzzleNode parent;

        PuzzleNode(int[][] board, int blankRow, int blankCol, int cost, PuzzleNode parent) {
            this.board = board;
            this.blankRow = blankRow;
            this.blankCol = blankCol;
            this.cost = cost;
            this.parent = parent;
            this.heuristic = findMisplacedTiles(board);
            this.totalCost = this.cost + this.heuristic;
        }

        static int findMisplacedTiles(int[][] board) {
            int[][] goal = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 0 }
            };
            int misplaced = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != 0 && board[i][j] != goal[i][j]) {
                        misplaced++;
                    }
                }
            }
            return misplaced;
        }
    }

    static void displayBoard(int[][] board) {
        for (int[] row : board) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean checkGoal(int[][] board) {
        int[][] goal = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 0 }
        };
        return Arrays.deepEquals(board, goal);
    }

    static int[][] duplicateBoard(int[][] board) {
        int[][] copy = new int[3][3];
        for (int i = 0; i < 3; i++) {
            copy[i] = board[i].clone();
        }
        return copy;
    }

    static void showPath(PuzzleNode node) {
        if (node == null)
            return;
        showPath(node.parent);
        displayBoard(node.board);
    }

    static void solvePuzzle(int[][] start, int row, int col) {
        PriorityQueue<PuzzleNode> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.totalCost));
        Set<String> visited = new HashSet<>();
        queue.offer(new PuzzleNode(start, row, col, 0, null));
        int[] rowMove = { 1, -1, 0, 0 };
        int[] colMove = { 0, 0, 1, -1 };

        while (!queue.isEmpty()) {
            PuzzleNode current = queue.poll();
            if (checkGoal(current.board)) {
                System.out.println("Goal State Reached!\nSolution Steps:");
                showPath(current);
                return;
            }
            visited.add(Arrays.deepToString(current.board));
            for (int i = 0; i < 4; i++) {
                int newRow = current.blankRow + rowMove[i];
                int newCol = current.blankCol + colMove[i];
                if (newRow >= 0 && newRow < 3 && newCol >= 0 && newCol < 3) {
                    int[][] nextBoard = duplicateBoard(current.board);
                    nextBoard[current.blankRow][current.blankCol] = nextBoard[newRow][newCol];
                    nextBoard[newRow][newCol] = 0;
                    String stateKey = Arrays.deepToString(nextBoard);
                    if (!visited.contains(stateKey)) {
                        queue.offer(new PuzzleNode(
                                nextBoard,
                                newRow,
                                newCol,
                                current.cost + 1,
                                current));
                    }
                }
            }
        }
        System.out.println("No Solution Exists");
    }

    public static void main(String[] args) {
        int[][] startBoard = {
                { 1, 2, 3 },
                { 4, 0, 6 },
                { 7, 5, 8 }
        };
        solvePuzzle(startBoard, 1, 1);
    }
}