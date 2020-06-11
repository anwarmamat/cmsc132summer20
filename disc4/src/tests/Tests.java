package tests;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import question.Addition;
import question.Division;
import question.MathTest;
import question.Multiplication;
import question.Question;
import question.Range;
import question.Subtraction;


public class Tests {

	
	@Test
	public void testAdd1() {
		Question q = new Addition(new Range(10,100));
		q.calc();
		int result = q.getAnswer();
		int expected = q.getFirstOperand() + q.getSecondOperand();
		assertEquals(expected, result);
	}
	
	@Test
	public void testAdd2() {
		Question q = new Addition(new Range(10,100));
		String result = q.toString();
		String expected= q.getFirstOperand() +  "+" +  q.getSecondOperand()+"=";
		assertEquals(expected, result);
		q.calc();
		result = q.toString();
		expected= q.getFirstOperand() +  "+" +  q.getSecondOperand() +"=" + q.getAnswer();
		assertEquals(expected, result);
		
	}
	
	
	@Test
	public void testSub1() {
		Question q = new Subtraction(new Range(10,100));
		q.calc();
		int result = q.getAnswer();
		int expected = q.getFirstOperand() - q.getSecondOperand();
		assertEquals(expected, result);
	}
	
	@Test
	public void testSub2() {
		Question q = new Subtraction(new Range(10,100));
		String result = q.toString();
		String expected= q.getFirstOperand() +  "-" +  q.getSecondOperand()+"=";
		assertEquals(expected, result);
		q.calc();
		result = q.toString();
		expected= q.getFirstOperand() +  "-" +  q.getSecondOperand() +"=" + q.getAnswer();
		assertEquals(expected, result);
	}
	
	
	
	@Test
	public void testMul1() {
		Question q = new Multiplication(new Range(10,100));
		q.calc();
		int result = q.getAnswer();
		int expected = q.getFirstOperand() * q.getSecondOperand();
		assertEquals(expected, result);
	}
	
	@Test
	public void testMul2() {
		Question q = new Multiplication(new Range(10,100));
		String result = q.toString();
		String expected= q.getFirstOperand() +  "*" +  q.getSecondOperand()+"=";
		assertEquals(expected, result);
		q.calc();
		result = q.toString();
		expected= q.getFirstOperand() +  "*" +  q.getSecondOperand() +"=" + q.getAnswer();
		assertEquals(expected, result);
	}
	
	@Test
	public void testDiv1() {
		Question q = new Division(new Range(10,100));
		q.calc();
		int result = q.getAnswer();
		int expected = q.getFirstOperand() / q.getSecondOperand();
		assertEquals(expected, result);
	}
	
	@Test
	public void testDiv2() {
		Question q = new Division(new Range(10,100));
		String result = q.toString();
		String expected= q.getFirstOperand() +  "/" +  q.getSecondOperand()+"=";
		assertEquals(expected, result);
		q.calc();
		result = q.toString();
		expected= q.getFirstOperand() +  "/" +  q.getSecondOperand() +"=" + q.getAnswer();
		assertEquals(expected, result);
	}
	
	
	
	@Test
	public void testRand1() {
		ArrayList<String> addList1 = new ArrayList<>();
		ArrayList<String> addList2 = new ArrayList<>();
		for(int i = 1; i <= 100; i++){
			Addition a = new Addition(new Range(1,1000));
			a.calc();
			addList1.add(a.toString());
		}
		
		for(int i = 1; i <= 100; i++){
			Addition a = new Addition(new Range(1,1000));
			a.calc();
			addList2.add(a.toString());
		}
		boolean r = addList1.equals(addList2);
		assertFalse(r);
		//assertNotEquals(addList1, addList2);
	}
	
	
	@Test
	public void testRand2() {
		ArrayList<String> addList1 = new ArrayList<>();
		ArrayList<String> addList2 = new ArrayList<>();
		for(int i = 1; i <= 100; i++){
			Subtraction a = new Subtraction(new Range(1,1000));
			a.calc();
			addList1.add(a.toString());
		}
		
		for(int i = 1; i <= 100; i++){
			Subtraction a = new Subtraction(new Range(1,1000));
			a.calc();
			addList2.add(a.toString());
		}boolean r = addList1.equals(addList2);
		assertFalse(r);
		//assertNotEquals(addList1, addList2);
		
	}
	
	
	//----------
	

	

	
	
	

  public static void main(String[] args){
    Result result = JUnitCore.runClasses(Tests.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
	
}
