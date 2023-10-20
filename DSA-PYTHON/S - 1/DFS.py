graph = {0: [1, 2, 3], 1: [0], 2: [0, 3, 4], 3: [0, 2], 4: [2]}

def DFS(graph, s):
    visited = {}
    ans = []

    for key in graph.keys():
        visited[key] = False

    stack = []

    stack.append(s)

    while stack:
        s = stack.pop()
        if not visited[s]:
            ans.append(s)
            visited[s] = True

        for i in graph[s]:
            if not visited[i]:
                stack.append(i)

    return ans

print(DFS(graph, 0))
