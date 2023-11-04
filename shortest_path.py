graph = {1:[2, 3, 4],
         2:[1, 5],
         3:[1, 8],
         4:[1, 6],
         5:[2, 8],
         6:[4, 7],
         7:[6, 8],
         8:[3, 5, 7]}

nV = len(graph)

parent = [-1] * (nV + 1)
visited = [False] * (nV + 1)

src = 1
dest = 8

queue = [src]
parent[src] = -1
visited[1] = True

while queue:
  s = queue.pop(0)

  for ch in graph[s]:
    if not visited[ch] and parent[ch] == -1:
      parent[ch] = s
      visited[ch] = True
      queue.append(ch)

print(parent[1:])

