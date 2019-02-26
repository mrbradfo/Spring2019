/**
 * CSE360 Assignment 2
 * Practice with version control
 * This program implements simple calculator functions
 * 
 * @author Matt
 * @version 1.1
 * @since 2019-02-23
 */
package cse360assign2;

public class Calculator {

	private int total;
	private String history = "0";
	
	/**
	 * Constructor 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the running total of all operations
	 * @return the total 
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Performs addition
	 * @return addition result
	 */
	public void add (int value) {
		history += " + " + value;
		total += value;
	}
	
	/**
	 * Performs subtraction
	 * @return subtraction result
	 */
	public void subtract (int value) {
		history += " - " + value;
		total -= value;
	}
	
	/**
	 * Performs multiplication
	 * @return multiplication result
	 */
	public void multiply (int value) {
		history += " * " + value;
		total *= value;
	}
	
	/**
	 * Performs division
	 * @return division result
	 */
	public void divide (int value) {
		history += " / " + value;
		if(value != 0)
			total /= value;
		
		if(value == 0)
			total = 0;
	}
	
	/**
	 * This function returns the history string
	 * @return history of all actions
	 */
	public String getHistory () {
		return history;
	}
}