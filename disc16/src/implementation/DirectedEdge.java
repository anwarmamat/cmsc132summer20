package implementation;

public class DirectedEdge implements Comparable<DirectedEdge>{
	private int v, w;
	private double weight;
	
	public DirectedEdge(int v, int w, double weight) {
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public int from() {
		return this.v;
	}
	
	public int to() {
		return this.w;
	}
	
	public double weight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean equals(Object other) {
		if(other == null) {
			return false;
		}
		if(this == other) {
			return true;
		}
		if(!(other instanceof DirectedEdge)) {
			return false;
		}
		
		DirectedEdge otherEdge = (DirectedEdge) other;
		return (this.v == otherEdge.v && this.w == otherEdge.w);
	}
	
	public int compareTo(DirectedEdge other) {
		return Double.compare(this.weight, other.weight);
	}
}
