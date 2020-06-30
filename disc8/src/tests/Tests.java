package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Stack;
import functions.CommonFunctions;
import functions.Node;

public class Tests {
	

	@Test
	public void length() {
		assertTrue(CommonFunctions.length(new Node(new int[] {1, 2, 3, 4, 5}))==5);
		assertTrue(CommonFunctions.length(new Node(new int[] {1, 2, -1, 6, 7}))==5);
		assertTrue(CommonFunctions.length(new Node(new int[] {0, 0, 0, 0, 0}))==5);
		assertTrue(CommonFunctions.length(new Node(new int[] {1, 2, 3, 4}))==4);
		assertTrue(CommonFunctions.length(new Node(new int[] {1111, 1, 1}))==3);
		assertTrue(CommonFunctions.length(new Node(new int[] {-1}))==1);
		assertTrue(CommonFunctions.length(new Node(new int[] {1, 2, 3, 4, 5, 4, 3, 2}))==8);
	}

	
	@Test
	public void balance(){
		assertTrue(CommonFunctions.isBalanced(""));
		assertTrue(CommonFunctions.isBalanced("abc"));
		assertTrue(CommonFunctions.isBalanced("ab"));
		assertTrue(CommonFunctions.isBalanced("a"));
		assertTrue(CommonFunctions.isBalanced("()"));
		assertTrue(CommonFunctions.isBalanced("(())"));
		assertTrue(CommonFunctions.isBalanced("(()())"));
		assertTrue(CommonFunctions.isBalanced("<(<>)>"));
		assertTrue(CommonFunctions.isBalanced("<[a[a]a]>"));
		assertTrue(CommonFunctions.isBalanced("(aa{aa<aa>aa}aa)aa"));
	}

	@Test
	public void fib(){
		assertTrue(CommonFunctions.fibonacci(0)==0);
		assertTrue(CommonFunctions.fibonacci(1)==1);
		assertTrue(CommonFunctions.fibonacci(2)==1);
		assertTrue(CommonFunctions.fibonacci(3)==2);
		assertTrue(CommonFunctions.fibonacci(4)==3);
		assertTrue(CommonFunctions.fibonacci(5)==5);
		assertTrue(CommonFunctions.fibonacci(6)==8);
		assertTrue(CommonFunctions.fibonacci(7)==13);
		assertTrue(CommonFunctions.fibonacci(8)==21);
		assertTrue(CommonFunctions.fibonacci(9)==34);
	}

	@Test
	public void fact(){
		assertTrue(CommonFunctions.factorial(0)==1);
		assertTrue(CommonFunctions.factorial(1)==1);
		assertTrue(CommonFunctions.factorial(2)==2);
		assertTrue(CommonFunctions.factorial(3)==6);
		assertTrue(CommonFunctions.factorial(4)==24);
		assertTrue(CommonFunctions.factorial(5)==120);
		assertTrue(CommonFunctions.factorial(6)==720);
	}

	@Test
	public void min(){
		int[] stack = new int[] {7, 2, 3, 1, 7, 8, 3, 4}; 
		int[] stack2 = new int[] {1, 9, 6, 3, 0}; 
		int[] stack3 = new int[] {-1, 2, 3, 3, 4}; 
		int[] stack4 = new int[] {0}; 
		assertTrue(CommonFunctions.min(new Node(stack)) == (1));
		assertTrue(CommonFunctions.min(new Node(stack2)) == (0));
		assertTrue(CommonFunctions.min(new Node(stack3)) == (-1));
		assertTrue(CommonFunctions.min(new Node(stack4)) == (0));
	}

/***********************RELEASE TESTS *******************/

	




  public static void main(String[] args){
    Result result = JUnitCore.runClasses(Tests.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
}
