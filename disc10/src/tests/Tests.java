package tests;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import tree.Tree;
import tree.Tree.Node;

public class Tests{
  private Tree makeTree(int[] x) {
	  Tree t = new Tree();
	  
	  for(int i : x) {
		  t.insert(i);
	  }
	  return t;
  }
 
	@Test
  public void makeFull() {
	  Tree tree1 = makeTree(new int[] {15, 8, 6, 3, 1, 4, 7, 12, 10, 9, 11, 14, 27, 20, 22, 28});
	  tree1.makeFull();
	  assertTrue(tree1.size()==17);
	  assertTrue(tree1.isFull());
	  
	  Tree tree2 = makeTree(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 17, 12, 20, 25});
	  tree2.makeFull();
	  assertTrue(tree2.size()==23);
	  assertTrue(tree2.isFull());
	  
	  Tree tree3 = makeTree(new int[] {15, 8, 6, 12, 27, 20, 29});
	  assertTrue(tree3.isFull());
	  tree3.makeFull();
	  assertTrue(tree3.size()==7);
	  assertTrue(tree3.isFull());
	  
  }
  
	@Test
  public void makePerf() {
	  Tree tree1 = makeTree(new int[] {15, 8, 6, 3, 1, 4, 7, 12, 10, 9, 11, 14, 27, 20, 22, 20, 28});
	  tree1.makePerf();
	  assertTrue(tree1.size()==7);
	  assertTrue(tree1.isComplete());
	  
	  Tree tree2 = makeTree(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 17, 12, 20, 25});
	  tree2.makePerf();
	  assertTrue(tree2.size()==1);
	  assertTrue(tree2.isComplete());
	  
	  Tree tree3 = makeTree(new int[] {15, 8, 6, 12, 27, 20, 29});
	  assertTrue(tree3.isComplete());
	  tree3.makePerf();
	  assertTrue(tree3.size()==7);
	  assertTrue(tree3.isComplete());
	  
  }
  
	@Test
  public void isFull(){
	  Tree tree1 = makeTree(new int[] {15, 8, 6, 3, 1, 4, 7, 12, 10, 9, 11, 14, 27, 20, 22, 18, 28});
	  assertTrue(tree1.isFull());
	  
	  Tree tree2 = makeTree(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 17, 12, 20, 25});
	  assertFalse(tree2.isFull());
	  
	  Tree tree3 = makeTree(new int[] {15, 8, 6, 12, 27, 20, 29});
	  assertTrue(tree3.isFull());
	  

	  Tree tree4 = makeTree(new int[] {15, 10, 7, 12, 20, 17, 16, 19, 21});
	  assertTrue(tree4.isFull());	 
  }
  
  
	@Test
  public void isComplete() {
	  Tree tree1 = makeTree(new int[] {15, 8, 6, 3, 1, 4, 7, 12, 10, 9, 11, 14, 27, 20, 22, 18, 28});
	  assertFalse(tree1.isComplete());
	  
	  Tree tree2 = makeTree(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 17, 12, 20, 25});
	  assertFalse(tree2.isComplete());
	  
	  Tree tree3 = makeTree(new int[] {15, 8, 6, 12, 27, 20, 29});
	  assertTrue(tree3.isComplete());
	  
	  Tree tree4 = makeTree(new int[] {15, 10, 7, 12, 20, 17, 16, 19, 21});
	  assertFalse(tree4.isComplete());	  
  }
  
  
  
  
	
  
  

  public static void main(String[] args){
    Result result = JUnitCore.runClasses(Tests.class);
      for (Failure failure : result.getFailures()) {
        System.out.println(failure.getTestHeader()+":"+failure.getTrace());
    }
  }
}
