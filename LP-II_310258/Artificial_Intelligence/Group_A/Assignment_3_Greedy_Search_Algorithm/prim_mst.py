def prim_mst(graph, vertices, labels):
    visited = [False] * vertices
    visited[0] = True
    edge_count = 0
    minimum_cost = 0
    print("Selected Edge : Weight")
    while edge_count < vertices - 1:
        smallest = float('inf')
        source = 0
        destination = 0
        for i in range(vertices):
            if visited[i]:
                for j in range(vertices):
                    if not visited[j] and graph[i][j] != 0:
                        if graph[i][j] < smallest:
                            smallest = graph[i][j]
                            source = i
                            destination = j
        print(f"{labels[source]} - {labels[destination]} : {graph[source][destination]}")
        minimum_cost += graph[source][destination]
        visited[destination] = True
        edge_count += 1
    print("Total Cost of MST =", minimum_cost)


graph = [
    [0, 10, 20, 0, 0],
    [10, 0, 30, 5, 0],
    [20, 30, 0, 15, 6],
    [0, 5, 15, 0, 8],
    [0, 0, 6, 8, 0]
]
labels = ['A', 'B', 'C', 'D', 'E']
prim_mst(graph, 5, labels)
