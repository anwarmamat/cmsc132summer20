package Tree;

public class Tree {
	public Node root;
	
	public class Node{
		//made these public so its easier to debug :)
		public Node left;
		public Node right;
		public int data;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Tree() {
		root = null;
	}

	public Tree(Tree t) {
		this.root = t.root;
	}
	
	
	/*
	 * insert a new node with given data into the BST.
	 * If the node already exists, return false
	 * otherwise, once node is inserted return true
	 */
	public boolean insert(int data) {
		//TODO
	}
	
	
	/*
	 * This returns the max height of the BST
	 */
	public int height(Node n) {
		if(n == null) {
			return 0;
		}
		int l = height(n.left);
		int r = height(n.right);
		return l > r ? l + 1 : r + 1;
		
	}
	/*
	 * Search for existence of the data
	 * return true if the data exists in the tree
	 * false if the data does not exist in the tree
	 */
	public boolean search(int data) {
		if(searchData(data, root) != null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	/*
	 * Search for a node that contains that specific data
	 * if data exists in the tree return the node containing it
	 * else return null
	 */
	public Node searchData(int data) {
		return searchData(data, root);
	}

	private Node searchData(int data, Node curr) {
		if(curr == null) { return null;}
		if(data < curr.data) {
			return searchData(data, curr.left);
		}
		else if(data > curr.data) {
			return searchData(data, curr.right);
		}
		else {
			return curr;
		}
	}
	
	/*
	 * delete a node from the BST
	 * return false if the node does not exist before deletion
	 * return true on successful deletion
	 * replace inner nodes with the larger node, then the smaller node 
	 * (only use greatest of left subtree when least of right subtree does not exist)
	 */
	public boolean delete(int data) {
		//TODO
	}
	
	/*
	 * Given a node, find the parent node to it
	 * if it does not exist return null
	 */
	public Node parent(Node child){
		//TODO
	}

	
	/*
	 * return the elements of the tree inorder as a string
	 */
	public String inOrder() {
		//TODO
	}
	
}
