import java.util.*;

public class GraphDFS {
    static void depthFirstSearch(List<List<Integer>> graph, int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");
        for (int nextNode : graph.get(current)) {
            if (!visited[nextNode]) {
                depthFirstSearch(graph, nextNode, visited);
            }
        }
    }

    static List<List<Integer>> buildGraph(int vertices, int edges, Scanner input) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println("Enter edges:");
        for (int i = 0; i < edges; i++) {
            int source = input.nextInt();
            int destination = input.nextInt();
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }
        return graph;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total vertices: ");
        int vertices = input.nextInt();
        System.out.print("Enter total edges: ");
        int edges = input.nextInt();
        List<List<Integer>> graph = buildGraph(vertices, edges, input);
        boolean[] visited = new boolean[vertices];
        System.out.print("Enter source vertex: ");
        int start = input.nextInt();
        System.out.print("Depth First Search: ");
        depthFirstSearch(graph, start, visited);
    }
}
