package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	private ArrayList<LinkedList<DirectedEdge>> adjList;
	
	public Graph(int size) {
		this.adjList = new ArrayList<LinkedList<DirectedEdge>>();
		for(int i = 0; i < size; i++) {
			adjList.add(null);
		}
	}
	
	public boolean addNode(int n) {
		if(n < this.adjList.size() && adjList.get(n) == null) {
			adjList.set(n, new LinkedList<DirectedEdge>());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addEdge(int source, int dest, double weight) {
		//Source and dest are valid nodes in the graph
		if(source < adjList.size() && dest < adjList.size() && adjList.get(source) != null && adjList.get(dest) != null) { 
			boolean found = false;
			DirectedEdge newEdge = new DirectedEdge(source, dest, weight);
			for(DirectedEdge e: adjList.get(source)) {
				if(e.equals(newEdge)) { //An edge already exists between source and dest
					e.setWeight(weight); //Replace its weight
					found = true;
					break;
				}
			}
			
			if(!found) { //An edge does not exist between source and dest
				adjList.get(source).addFirst(newEdge); //add the new edge
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasEdge(int source, int dest) {
		return (source < this.adjList.size() && dest < this.adjList.size() && this.adjList.get(source) != null && 
				this.adjList.get(source).contains(new DirectedEdge(source, dest, 0)));
	}
	
	/**
	 * Find the shortest path between source and dest using Dijkstra's algorithm. You can assume the shortest path will be unique.
	 * @param source The node to start from
	 * @param dest The node to end at
	 * @return A list containing each node on the shortest path in order. Return null if source or dest is invalid. Return null if
	 * there is no such path.
	 */
	
	public List<Integer> dijkstraShortestPath(int source, int dest) { 
		//TODO
	}
	
}
