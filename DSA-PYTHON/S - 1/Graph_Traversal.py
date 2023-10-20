graph = {0: [1, 2], 1: [0, 2, 3], 2: [0, 1, 4], 3: [1, 4], 4: [2, 3]}


def BFS (graph, s):
  
  visited = {}
  ans = []

  for key in graph.keys():
    visited[key] = False
  
  queue = []

  queue.append(s)
  visited[s] = True

  while queue:
    s = queue.pop(0)
    ans.append(s)

    for i in graph[s]:
      if visited[i] == False:
        queue.append(i)
        visited[i] = True
  
  return ans

print(BFS(graph, 0))
    
