package tests;

import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import implementation.Graph;

public class Tests {

	@Test
	public void testAddEdge() {
		Graph g = new Graph(10);
		
		assertFalse(g.hasEdge(0, 1));
		assertTrue(g.addNode(0));
		assertTrue(g.addNode(1));
		assertTrue(g.addEdge(0, 1, 3));
		assertTrue(g.hasEdge(0, 1));
		
		assertTrue(g.addNode(2));
		assertTrue(g.addEdge(1, 2, 4));
		assertTrue(g.hasEdge(1, 2));
		
		assertTrue(g.addEdge(0, 1, 10));
		assertTrue(g.hasEdge(0,  1));
		
		assertFalse(g.addNode(10));
		assertFalse(g.addEdge(5, 2, 4));
		assertFalse(g.hasEdge(10, 2));
	}

	@Test
	public void testDijkstra1() {
		Graph g = new Graph(2);
		
		g.addNode(0);
		g.addNode(1);
		g.addEdge(0, 1, 50);
		assertEquals(Arrays.asList(0, 1), g.dijkstraShortestPath(0, 1));
	}
	
	@Test
	public void testDijkstra2() {
		Graph g = new Graph(3);
		g.addNode(0);
		g.addNode(1);
		g.addNode(2);
		
		g.addEdge(0, 1, 50);
		g.addEdge(0, 2, 100);
		g.addEdge(1, 2, 49);
		
		assertEquals(Arrays.asList(0, 1, 2), g.dijkstraShortestPath(0, 2));
		
		g.addEdge(0, 2, 5);
		assertEquals(Arrays.asList(0, 2), g.dijkstraShortestPath(0, 2));
	}
	
	@Test
	public void testDijkstra3() {
		Graph g = new Graph(8);
		for(int i = 0; i < 8; i++) {
			g.addNode(i);
		}
		
		g.addEdge(0, 1, 5);
		g.addEdge(0, 2,  1);
		g.addEdge(0, 4, 10);
		g.addEdge(0,  5, 20);
		g.addEdge(1, 2, 8);
		g.addEdge(1, 3, 5);
		g.addEdge(1, 6, 1);
		g.addEdge(2, 4, 12);
		g.addEdge(3, 2, 2);
		g.addEdge(5, 4, 11);
		g.addEdge(5, 6, 1);
		g.addEdge(6, 4, 3);
		g.addEdge(6, 7, 2);
		g.addEdge(7, 3, 1);
		g.addEdge(7, 4, 4);
		
		assertEquals(Arrays.asList(1, 6, 7, 3), g.dijkstraShortestPath(1,  3));
		assertEquals(Arrays.asList(1, 6, 7, 3, 2), g.dijkstraShortestPath(1, 2));
		assertEquals(Arrays.asList(0, 1, 6), g.dijkstraShortestPath(0, 6));
		assertNull(g.dijkstraShortestPath(4, 6));
	}


	@Test
	public void testDijkstra4() {
		Graph g = new Graph(2);
		g.addNode(0);
		assertEquals(Arrays.asList(0), g.dijkstraShortestPath(0, 0));
		assertEquals(null, g.dijkstraShortestPath(1, 1));
	}

	
  public static void main(String[] args){
    Result result = JUnitCore.runClasses(Tests.class);
      for (Failure failure : result.getFailures()) {
        System.out.println(failure.getTestHeader()+":"+failure.getTrace());
    }
  }
}
