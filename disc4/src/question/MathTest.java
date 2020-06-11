/**
 * Second grade math test generator
 * 
 * We want to test second grade students' math. We will give them 10 randomly generated 
 * addition, subtraction, multiplication, and division questions. 
 *  For example:
 *  
Questions:
86+28= 
3+46= 
93*80= 
5+56= 
40-25= 
59/51= 
16/14= 
69+75= 
60+63= 
59-44= 

*We also want to generate the solution to check their answer. 
*For example:

Solution:
86+28=114
3+46=49
93*80=173
5+56=61
40-25=15
59/51=110
16/14=30
69+75=144
60+63=123
59-44=15

For this project, you implement the classes that generate addition, 
subtraction, multiplication, and division questions. 

When you run the MathTest, you will see:

Questions:
86+28= 
3+46= 
93*80= 
5+56= 
40-25= 
59/51= 
16/14= 
69+75= 
60+63= 
59-44=  
Solution:
86+28=114
3+46=49
93*80=173
5+56=61
40-25=15
59/51=110
16/14=30
69+75=144
60+63=123
59-44=15
 *  
 *  
 *  Second graders do not know negative numbers and fractions. Therefore, 
 *  for subtraction and division, you make sure first operand is always grater 
 *  than the second operand. 
 */

/**
 * DO NOY MODIFY THIS CLASS
 */
package question;
import java.util.ArrayList;

public class MathTest {
	public static void main(String args[])
	{
		Range r = new Range(1,100);			
		ArrayList<Question> ql = new ArrayList<>();
		/*
		 * Randomly generate 10 questions 
		 */
		for(int i = 1; i <= 10; i++){
			int t = RandomNumber.getRandomInteger(4);
			switch(t){
			case 1: ql.add(new Addition(r));
				break;
			case 2: ql.add(new Subtraction(r));
				break;
			case 3: ql.add(new Multiplication(r));
				break;
			case 4: ql.add(new Division(r));
				break;			
			}
		}

		/**
		 * 	DO NOY MODIFY THIS CLASS
		 */
		/*
		 * Print the questions without answers
		 */
		System.out.println("Questions:");
		for(Question q: ql){
			System.out.println(q);
		}
		/*
		 *	Calculate the answers 
		 */
		for(Question q: ql){
			q.calc();
		}
		/*
		 * Print the questions with solutions 
		 */
		System.out.println("Solution:");
		for(Question q: ql){
			System.out.println(q);
		}
	}
}
		
