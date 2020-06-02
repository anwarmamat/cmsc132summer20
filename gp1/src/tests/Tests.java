package tests;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import fraction.Fraction;

public class Tests{
	@Test
	public void testWhole(){
    Fraction a = new Fraction(5,1);
    Fraction b = new Fraction(5,2);
    Fraction c = new Fraction(20,10);
    assertEquals(true, a.isWhole());
    assertEquals(false, b.isWhole());
    assertEquals(true, c.isWhole());
	}

	@Test
	public void testAdd(){
    Fraction a = new Fraction(5,1);
    Fraction b = new Fraction(1,5);
    Fraction c = new Fraction(3,20);
    assertTrue(new Fraction(103,20).isEqual(a.sum(c).simplify()));
    assertTrue(new Fraction(7,20).isEqual(b.sum(c).simplify()));
	}
	@Test
	public void testSub(){
    Fraction a = new Fraction(5,1);
    Fraction b = new Fraction(3,5);
    Fraction c = new Fraction(3,20);
    assertTrue(new Fraction(97,20).isEqual(a.difference(c).simplify()));
    assertTrue(new Fraction(9,20).isEqual(b.difference(c).simplify()));
	}
	@Test
	public void testMult(){
    Fraction a = new Fraction(5,1);
    Fraction b = new Fraction(1,6);
    Fraction c = new Fraction(1,2);
    assertTrue(new Fraction(5,2).isEqual(a.product(c).simplify()));
    assertTrue(new Fraction(1,12).isEqual(b.product(c).simplify()));
	}

	@Test
  public void testDivide(){
    Fraction a = new Fraction(1,4);
    Fraction b = new Fraction(2,1);
    Fraction c = new Fraction(1,2);
    assertTrue(new Fraction(1,2).isEqual(a.quotient(c).simplify()));
    assertTrue(new Fraction(4,1).isEqual(b.quotient(c).simplify()));
  }

	@Test
	public void testSimplify(){
    Fraction a = new Fraction(24,6);
    Fraction b = new Fraction(11,99);
    assertEquals(true, a.simplify().isEqual(new Fraction(4,1)));
    assertEquals(false,a.simplify().isEqual(new Fraction(1,4)));
    assertEquals(true, b.simplify().isEqual(new Fraction(1,9)));
    assertEquals(false,b.simplify().isEqual(new Fraction(9,1)));
	}

  public static void main(String[] args){
    Result result = JUnitCore.runClasses(Tests.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
}
