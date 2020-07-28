package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	/*
	 * This implements a Directed Graph using adjacency lists
   * Values of the nodes will be the indices of the matrix. 
	 */
	
	public int[][] adj;

	public Graph(int[][] num) {
		adj = num;
	}
	public void addEdge(int start, int e) 
	{
	    adj[start][e] = 1; 
	    adj[e][start] = 1; 
	} 

	//execute Breadth-First Search starting at 0
	//when multiple out degrees exist, do them in the order of the adj matrix (smaller numbers)
	//return a string of the toString() of the data in the nodes concatenated together (no spaces)
	public String BFS(int g) {
		//TODO
	}
	//execute Depth-First Search starting at the given node of the graph
	//when multiple out degrees exist, do them in the order of the adj matrix (smaller numbers)
	//return a string of the toString() of the data in the nodes concatenated together (no spaces)	
	public String DFS(int g) {
		//TODO
	}
	
	//Given a node, simply return if a cycle exists in the reachable graph
	public boolean hasCycle(int g) {
		//TODO
	}
}
