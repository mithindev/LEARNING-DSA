import copy

def posmovs(arr):
    ind = []
    lengthx = len(arr)
    lengthy = len(arr[0])
    for i in range(lengthx):
        for j in range(lengthy):
            if arr[i][j] == 0:
                ind.append(i)
                ind.append(j)
                break
    posmoves = []
    if ind[0] < lengthx - 1:
        posmoves.append([ind[0] + 1, ind[1]])
    if ind[1] < lengthy - 1:
        posmoves.append([ind[0], ind[1] + 1])
    if ind[0] > 0:
        posmoves.append([ind[0] - 1, ind[1]])
    if ind[1] > 0:
        posmoves.append([ind[0], ind[1] - 1])
            
    return posmoves, ind

def is_equal_state(arr1, arr2):
    return all(arr1[i][j] == arr2[i][j] for i in range(len(arr1)) for j in range(len(arr1[0])))

def DFS(arr, goal):
    stack = [(arr, 0)]
    visited = set()

    while stack:
        curr, depth = stack.pop()

        if is_equal_state(curr, goal):
            return curr

        visited.add(tuple(map(tuple, curr)))

        x, y = posmovs(curr)
        for i in range(len(x)):
            arr1 = copy.deepcopy(curr)
            arr1[x[i][0]][x[i][1]], arr1[y[0]][y[1]] = arr1[y[0]][y[1]], arr1[x[i][0]][x[i][1]]
            if tuple(map(tuple, arr1)) not in visited:
                stack.append((arr1, depth + 1))

    return None

def BFS(arr, goal):
    poss = [arr]
    visited = set()

    while poss:
        curr = poss.pop(0)

        if is_equal_state(curr, goal):
            return curr

        visited.add(tuple(map(tuple, curr)))

        x, y = posmovs(curr)
        for i in range(len(x)):
            arr1 = copy.deepcopy(curr)
            arr1[x[i][0]][x[i][1]], arr1[y[0]][y[1]] = arr1[y[0]][y[1]], arr1[x[i][0]][x[i][1]]
            print(arr1)
            if tuple(map(tuple, arr1)) not in visited:
                poss.append(arr1)
            
    return None

a = [[2, 8, 3], [1, 6, 4], [7, 0, 5]]
g = [[1, 2, 3], [8, 0, 4], [7, 6, 5]]

print(BFS(a, g))
print(DFS(a, g))
