package com.dsa.amarsir.day4;

import java.util.Scanner;

public class Graph_Class {
	int v, visited[], g[][];
	// v number of nodes
	// g is Adjacency matrix of v x v
	// visited[i] is 1:visited 0:unvisited

	void createGraph(int nodes) {
		v = nodes;
		Scanner in = new Scanner(System.in);
		g = new int[v][v];// adj mat
		visited = new int[v];// visited array
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.println("Enter value for v" + i + " to v" + j + " (999 for infinity):");
				g[i][j] = in.nextInt();

			}
		}
		in.close();
	}

	void printG() {
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.print(g[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void resetvisited() {
		for (int i = 0; i < v; i++) {
			visited[i] = 0;// unvisited 0 and 1 means visited
		}

	}

	public void DFS(int source) {
		visited[source] = 1;
		System.out.println("V" + source);
		for (int i = 0; i < v; i++) {
			if (g[source][i] == 1 && visited[i] != 1)
			// neighbour and unvisited
			{
				DFS(i);
			}
		}
	}

	public boolean DFS_search(int source, int key) {
		boolean flag = false;
		if (key == source) {
			flag = true;
		}
		visited[source] = 1;
		System.out.println("V" + source);
		for (int i = 0; i < v; i++) {
			if (g[source][i] == 1 && visited[i] != 1)// neighbour and unvisited
			{
				DFS_search(i, key);
			}
		}
		return (flag);
	}

	public void BFS(int source) {
		int q[] = new int[v];
		int front = 0, rear = -1;
		visited[source] = 1;
		q[++rear] = source;// enqueue
		while (front <= rear)// not empty empty front>rear
		{
			int element = q[front++];// dequeue
			System.out.print("V" + element + "-");

			for (int i = 0; i < v; i++) {
				if (g[element][i] == 1 && visited[i] != 1)// neighbour and unvisited
				{
					visited[i] = 1;// visited
					q[++rear] = i;// enqueue
				}
			}
		}
	}

	public static void main(String args[]) {
		Graph_Class obj = new Graph_Class();
		obj.createGraph(4);
		obj.printG();
		obj.resetvisited();
		System.out.println("DFS");
		obj.DFS(0);
		obj.resetvisited();
		System.out.println("BFS");
		obj.BFS(0);

	}
}