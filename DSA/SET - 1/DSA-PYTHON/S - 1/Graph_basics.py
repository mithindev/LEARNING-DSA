import numpy as np
import networkx as nx3
import matplotlib.pylot as plt

class Graph():
    
    def init(self,size):
        self.adjmatrix = []
        for i in range(size):
            self.adjmatrix.append([0 for i in range(size)])
        self.size = size
        
    def addEdge(self,v1,v2):
        self.adjmatrix[v1][v2] = 1
        self.adjmatrix[v2][v1] = 1
        
    def removeEdge(self,v1,v2):
        if self.adjmatrix[v1][v2] == 0:
            print("Edge %d and %d doesn't exists" % (v1,v3))
            return
        self.adjmatrix[v1][v2] = 0
        self.adjmatrix[v2][v1] = 0
        
    def numberOfNodes(self):
        return self.size
    
    def numberOfEdges(self):
        e = 0
        for i in range(self.size):
            for j in range(self.size):
                if self.adjmatrix[i][j] == 1:
                    e +=1
        return int(e/2)
    
    def printMatrix(self):
        for row in self.adjmatrix:
            for i in row:
                print(i, " ")
            print(" ")
            
    def visualizeGraph(self,G):
        nx.draw(G, with_labels = True)
        
        
if _name_ == '_main_':
    
    print("Creating a graph")
    
    g=Graph(4)
    g.addedge(0, 1)
    g.addedge(0, 2)
    g.addedge(1, 2)
    g.addedge(2, 0)
    g.addedge(2, 3)
    g.addedge(0, 3)
    g.addedge(1, 3)
    
    g.printMatrix()
    B = g.adjmatrix
    print("Number of nodes in the graph = ", g.numberofNode())
    print("Number of edges in the graph = ", g.numberofEdges())
    
    G = nx.from_numpy_matrix(np.matrix(B))
    plt.figure()
    g.visualizeeGraph(G)
    
    print("----------------------")