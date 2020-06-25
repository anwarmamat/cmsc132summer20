package functions;

import java.util.ArrayList;
import java.util.Stack;

/*
 * You must implement the following methods using Java's Stack object to 
 * replace the iteration/recursion in the original functions with a series
 * of stack operations, including push, pop, peek and isEmpty. Use no other
 * special library functions or classes; in other words, your code should use
 * standard arithmetic operators and in the case of the reverse function, only
 * push and pop and the default constructor for whichever Java collection
 * class you choose to represent lists.
 */

public class CommonFunctions {
	/**
	 * computes the factorial of n
	 * @param n-integer value greater or equal to 0
	 * @return n!
	 */
	public static int factorial( int n ) {
		//TODO
	}
	/**
	 * computes the nth term of the fibonacci sequence
	 * @param n -nth term to find
	 * @return -the nth term
	 */
	public static int fibonacci( int n ) {
		//TODO
	}
	/**
	 * find the min value using the comparable interface of the elements found in theStack
	 * @param theStack-the stack of objects to search
	 * @return the min value
	 */
	public static <T extends Comparable< T> > T min( Stack< T > theStack ) {
		//TODO
	}
	/**
	 * take a string and makes sure the parenthesis are correctly formatted
	 * @param text the text to check
	 * @return if correctly fomrated to not
	 */
	public static boolean isBalanced( String text ) {
		//TODO
	}
	
	/**
	 * checks a string for palindrome-ness
	 * @param str string to check
	 * @return returns true if str is a palnindrome
	 */
	public static boolean isPalindrome( String str ) {
		//TODO
	}
}
