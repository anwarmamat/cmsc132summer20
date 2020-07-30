package implementation;

public class Cost implements Comparable<Cost> {

	public int node;
	public double cost;
	public Integer pred; //Used to indicate the direct node from which node is reached in the shortest path to node.
	
	public Cost(int node, double cost, Integer pred) {
		this.node = node;
		this.cost = cost;
		this.pred = pred;
	}
	
	public int compareTo(Cost other) {
		return Double.compare(this.cost, other.cost);
	}
	
	public boolean equals(Object other) {
		if(other == null) {
			return false;
		}
		if(this == other) {
			return true;
		}
		if(!(other instanceof Cost)) {
			return false;
		}
		
		Cost otherCost = (Cost)other;
		return this.node == otherCost.node;
	}
}
