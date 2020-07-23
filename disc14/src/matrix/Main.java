package matrix;

import java.util.ArrayList;

public class Main {
	/**
	 * This method finds the sum of the rows or columns beginning form index start inclusive and ending at the
	 * index stop inclusive. It does so by creating threads to sum each row or column, placing the sum in the 
	 * appropriate index of the result array list.
	 * If the matrix is null, start > stop or start and stop are invalid, findSum should do nothing and leave results unchanged.
	 * @param matrix The grid of numbers to be used in the sum
	 * @param results array list that will hold the result of each sum
	 * @param threads This array list should contain a duplicate of all the Threads you created.
	 * @param start The first row/col to be summed
	 * @param stop The last row/col to be summed - notice these bounds are inclusive
	 * @param sumRow true if a row sum is required, false if a column sum is required.
	 */

	public static void findSum(int[][] matrix, ArrayList<Integer> results, ArrayList<Thread> threads, int start, int stop, boolean sumRow) {
		//TODO
	}
}
