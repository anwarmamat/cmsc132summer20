package tree;

public class Tree{
	public class Node{
		public Node left;
		public Node right;
		int data;
		
		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	
		public String inOrder(Node a) {
			if(a == null) return "";
			else return inOrder(a.left).trim() + " " + a.data + " " + inOrder(a.right).trim();
		}
	}
	public Node root;
	
	public Tree(){
		this(null);
	}

	public Tree(Node root) {
		this.root = root;
	}
	/* 
	 * A full tree is one where each node has either 0 or 2 children.
	 * return true if this tree is full, else return false
	 */
	public boolean isFull(){
		//TODO
	}
	/*
	 * A complete tree is one where every level of the tree is complete
	 * except for the last one. The lowest level (known as the fringe) 
	 * must be filled left to right with no missing nodes
	 * return true if the tree s complete, false otherwise. 
	 */
	public boolean isComplete() {
		//TODO
	}
	

	/* 
	 * Recall what a full tree is from the isFUll() method.
	 * This function should add the minimum number of nodes to the tree so that
	 * the tree is full. The values added do not matter. 
	 */
	public void makeFull() {
		//TODO
	}

	/* 
	 * A perfect tree is one were all levels are completely
	 * full. This function should remove minimum number of nodes so that
	 * the tree ends up perfect. 
	 */
	public void makePerf() {
		//TODO
	}
	public int height(Node curr){
		if(curr == null)
			return 0;
		int lheight = 1 + height(curr.left);
		int rheight = 1 + height(curr.right);
		return lheight > rheight ? lheight : rheight;	
		
	}
	
	public int size(){
		return size(this.root);
	}
	private int size(Node curr){
		if(curr == null)
			return 0;
		return 1 + size(curr.left) + size(curr.right);
	}
	
	public void insert(int data) {
		if(this.root == null) {
			this.root = new Node(data);
			return;
		}
		Node p = this.root;
		Node c = null;
		if(data <= p.data)
			c = p.left;
		else
			c = p.right;
		while(c != null) {
			p = c;
			if(data <= p.data)
				c = p.left;
			else
				c = p.right;
		}
		if(data <= p.data)
			p.left = new Node(data);
		else
			p.right = new Node(data);
	}
	public String toStrHelp(Node c) {
		if(c == null)
			return "nil";
		return "(" + c.data +"," + toStrHelp(c.left) + "," + toStrHelp(c.right) +")";
	}
	
	public String toString() {
		return toStrHelp(this.root);
	}
}
