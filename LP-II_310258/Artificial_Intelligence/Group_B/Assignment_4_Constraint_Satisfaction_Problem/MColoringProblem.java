package Group_B.Assignment_4_Constraint_Satisfaction_Problem;
public class MColoringProblem {
    private int vertices;
    private int[][] adjacencyMatrix;
    private int[] assignedColors;
    private String[] colorLabels = { "", "Red", "Green", "Blue", "Yellow" };

    public MColoringProblem(int[][] matrix) {
        this.vertices = matrix.length;
        this.adjacencyMatrix = matrix;
        this.assignedColors = new int[vertices];
    }

    private boolean canUseColor(int vertex, int color) {
        for (int i = 0; i < vertices; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && assignedColors[i] == color) {
                return false;
            }
        }
        return true;
    }

    private boolean applyColoring(int vertex, int totalColors) {
        if (vertex == vertices) {
            displaySolution();
            return true;
        }
        for (int color = 1; color <= totalColors; color++) {
            if (canUseColor(vertex, color)) {
                assignedColors[vertex] = color;
                if (applyColoring(vertex + 1, totalColors)) {
                    return true;
                }
                assignedColors[vertex] = 0; // backtrack
            }
        }
        return false;
    }

    private void displaySolution() {
        System.out.println("Graph Coloring Solution:");
        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + " -> " + colorLabels[assignedColors[i]]);
        }
    }

    public void solve(int totalColors) {
        if (!applyColoring(0, totalColors)) {
            System.out.println("No valid coloring possible.");
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 1 },
                { 1, 0, 1, 0 }
        };
        int totalColors = 3;
        MColoringProblem coloring = new MColoringProblem(graph);
        coloring.solve(totalColors);
    }
}
