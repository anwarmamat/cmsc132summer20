package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import Tree.Tree;


public class Tests {
	private Tree makeTree(int[] x) {
		  Tree t = new Tree();
		  
		  for(int i : x) {
			  t.insert(i);
		  }
		  return t;
	  }	
	
	@Test
	public void testInsert1() {
		Tree t = makeTree(new int[] {15, 8, 6, 3, 1, 4, 7, 12, 10, 9, 11, 14, 27, 20, 22, 28});
		assertTrue(t.search(12));
		assertFalse(t.search(124));
		assertTrue(t.search(28));
		assertTrue(t.height(t.root) == 5);
		Tree t2 = new Tree();
		t2.insert(1);
		assertTrue(t2.search(2) == false);
		assertTrue(t2.searchData(2) == null);

	    Tree tree1 = makeTree(new int[] {3, 2, 1, 5, 4});
	    assertEquals(tree1.inOrder(), "12345");
	}
	
	
	@Test
	public void testParent1() {
		Tree t = makeTree(new int[] {4, 2, 1, 6, 5, 10});
		assertTrue(t.parent(t.searchData(2)) == t.searchData(4));
		assertTrue(t.parent(t.searchData(4)) == null);
	}
	
	

	@Test
	public void testDelete1() {
		Tree t = makeTree(new int[] {4, 2, 1, 6, 5, 10});
		t.delete(10);
		assertTrue(t.search(10) == false);
		assertTrue(t.height(t.root) == 3);
		t.delete(4);
		assertFalse(t.root.data == 4);
	}
	
	
	@Test
	public void testInOrder() {
		Tree t = makeTree(new int[] {4, 2, 1, 6, 5, 10});
		assertTrue(t.inOrder().equals("1245610"));
		Tree t2 = makeTree(new int[] {15, 8, 6, 3, 1, 4, 7, 12, 10, 9, 11, 14, 27, 20, 22, 28});
		assertTrue(t2.inOrder().equals("1346789101112141520222728"));
	}
	
	public static void main(String[] args){
    Result result = JUnitCore.runClasses(Tests.class);
      for (Failure failure : result.getFailures()) {
        System.out.println(failure.getTestHeader()+":"+failure.getTrace());
    }
	}
}
