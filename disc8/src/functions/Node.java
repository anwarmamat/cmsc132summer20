package functions;

//Don't touch this class
public class Node{
	
	  public Node next;
	  public int value;

	  public Node(int[] data) {
		  this(data, 0);
	  }
	  
	  private Node(int[] data, int index) {
		  this.value = data[index];
		  if (data.length - 1 == index) {next = null; return;}
		  this.next = new Node(data, index + 1);
	  }
}
