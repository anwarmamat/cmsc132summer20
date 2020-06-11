/**
 * Random Integer Generator
 * DO NOY MODIFY THIS CLASS
 */
package question;
import java.util.Random;
public class RandomNumber {
	
	/**
	 * 
	 * @param r: a range, from which a random int will be generated
	 * @return: an int in range r, max,min inclusive
	 */
	public static int getRandomInteger(Range r){
		Random random = new Random();
		int t = random.nextInt(r.getMax() - r.getMin() + 1);
		return (t + r.getMin());
	}
	/**
	 * 
	 * @param max: int value. R random int will be generated in range (1,max) 
	 * @return: a random int in range (1, max), inclusive 
	 */
	public static int getRandomInteger(int max){
		Range r = new Range(1,max);
		return getRandomInteger(r);
	}
	
	private RandomNumber(){
		System.out.println("DO NOT REMOVE THIS");
	}
}
