import java.util.*;

public class GraphBFS {
    static void performBFS(List<List<Integer>> adjList, int source) {
        boolean[] isVisited = new boolean[adjList.size()];
        Queue<Integer> nodes = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        nodes.offer(source);
        isVisited[source] = true;
        while (!nodes.isEmpty()) {
            int current = nodes.poll();
            result.append(current).append(" ");
            for (int next : adjList.get(current)) {
                if (!isVisited[next]) {
                    isVisited[next] = true;
                    nodes.offer(next);
                }
            }
        }
        System.out.println("Breadth First Search: " + result);
    }

    static List<List<Integer>> createGraph(int vertices, Scanner input) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
        System.out.println("Enter edges:");
        int edges = input.nextInt();
        for (int i = 0; i < edges; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        return adjList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total vertices: ");
        int vertices = input.nextInt();
        System.out.print("Enter total edges: ");
        List<List<Integer>> graph = createGraph(vertices, input);
        System.out.print("Enter source vertex: ");
        int source = input.nextInt();
        performBFS(graph, source);
    }
}
