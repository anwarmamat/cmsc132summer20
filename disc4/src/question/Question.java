/**
 * Question abstract class
 * 
 * Addition, Subtraction, Multiplication, and Division inherits this class. 
 * DO NOT ADD any member variables in subclasses. 
 */
package question;
public abstract class Question {
	protected int operand1;	//fist operand
	protected int operand2;	//second operand
	protected String operator;	
	protected int answer;
	protected boolean calculated = false;	//become true if the answer is calculated
	protected String questionType="unknown";
	
	/**
	 * Calculates the answer
	 * 
	 * Each subclass of the Question has to implement its own calc method. 
	 */
	public abstract void calc();	
	
	/**
	 * Get the operator for the current question
	 * @return: the operator
	 */
	public String getOpertor(){
		return operator;
	};
 	
	/**
	 * Get the answer
	 * @return: the answer for the current question
	 */
	public int getAnswer(){
		return answer;
	}
	/**
	 * 
	 * @param questionType: type of the question
	 * @param operator: the operator
	 */
	public Question(String questionType, String operator){
		this.questionType = questionType;
		this.operator = operator;
	}
	
	@Override
	public String toString(){
		//TODO
	}
	
	public int getFirstOperand(){
		return operand1;
	}
	
	public int getSecondOperand(){
		return operand2;
	}
}

