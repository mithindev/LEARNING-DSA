package com.Mithin.GRAPH;

import java.util.ArrayList;
import java.util.List;

class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph {
    static class Node {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    private List<List<Node>> adjacencyList;

    public Graph(List<Edge> edges, int numberOfVertices) {
        adjacencyList = new ArrayList<>(numberOfVertices);

        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (Edge edge : edges) {
            adjacencyList.get(edge.src).add(new Node(edge.dest, edge.weight));
        }
    }

    public void print() {
        System.out.println("Graph Adjacency List:");
        for (int srcVertex = 0; srcVertex < adjacencyList.size(); srcVertex++) {
            System.out.print(srcVertex + ": ");
            for (Node neighbor : adjacencyList.get(srcVertex)) {
                System.out.print("(" + neighbor.vertex + ", " + neighbor.weight + ") ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Edge> edges = List.of(
                new Edge(0, 1, 2), new Edge(0, 2, 4),
                new Edge(1, 2, 4), new Edge(2, 0, 5),
                new Edge(2, 1, 4), new Edge(3, 2, 3),
                new Edge(4, 5, 1), new Edge(5, 4, 3)
        );

        int numberOfVertices = 6; // Number of vertices in the graph

        Graph graph = new Graph(edges, numberOfVertices);

        graph.print();
    }
}
