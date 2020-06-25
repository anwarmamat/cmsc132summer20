package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Stack;
import functions.CommonFunctions;

public class Tests {

	@Test
	public void palindrome() {
		assertTrue(CommonFunctions.isPalindrome(""));
		assertTrue(CommonFunctions.isPalindrome("a"));
		assertTrue(CommonFunctions.isPalindrome("a a"));
		assertTrue(CommonFunctions.isPalindrome("aa"));
		assertTrue(CommonFunctions.isPalindrome("babbab"));
		assertTrue(CommonFunctions.isPalindrome("abba"));
		assertTrue(CommonFunctions.isPalindrome("babab"));
		assertFalse(CommonFunctions.isPalindrome("baba"));
		assertFalse(CommonFunctions.isPalindrome("ba"));
		assertFalse(CommonFunctions.isPalindrome("babaa"));
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
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		stack.push(new Integer(4));
		stack.push(new Integer(5));
		stack.push(new Integer(6));
		stack.push(new Integer(7));
		stack.push(new Integer(8));
		assertTrue(CommonFunctions.min(stack).equals(1));
	}

/***********************RELEASE TESTS *******************/





  public static void main(String[] args){
    Result result = JUnitCore.runClasses(Tests.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
}
