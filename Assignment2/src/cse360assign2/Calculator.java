/**
 * CSE360 Assignment 2
 * Practice with version control
 * This program implements simple calculator functions
 * 
 * 
 * @author Matt
 * @version 1.0
 * @since 2019-02-23
 */
package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
	}
	
	public void subtract (int value) {
		total -= value;
	}
	
	public void multiply (int value) {
		total *= value;
	}
	
	public void divide (int value) {
		if(value != 0)
			total /= value;
		
		if(value == 0)
			total = 0;
	}
	
	public String getHistory () {
		return "";
	}
}