package cse360assign3;

import java.util.ArrayList;

/**
 * An adding machine, adds and subtracts values 
 * while keeping a transactions history.
 * @author Jacob Ybarra
 *<p>
 *ASUID: 1213015295
 */
public class addingMachine 
{
	
	protected int total;
	protected ArrayList transactions = new ArrayList();
	/**
	 * The Constructor method, creates the object.
	 * Used to set the total and transactions.
	 */
	public addingMachine () 
	{
		total = 0;  // not needed - included for clarity
		transactions.add(0);
	}
	/**
	 * It will return the total amount of all 
	 * operations calculated before a clear.
	 * @return an integer that represents the total calculated so far.
	 */
	public int getTotal () 
	{
		return total;
	}
	/**
	 * Adds an integer value to the total value stored 
	 * and stores that value in transactions.
	 * @param value the integer added to the total.
	 */
	public void add (int value) 
	{
		transactions.add("+");
		transactions.add(value);
		total = total + value;
	}
	/**
	 * Subtracts an integer from the total value 
	 * and stores that value in transactions.
	 * @param value the integer subtracted from the total.
	 */
	public void subtract (int value) 
	{
		transactions.add("-");
		transactions.add(value);
		total = total - value;
	}
	/**
	 * Converts the values stored from all operations to a String object.
	 * @return a String that holds the values and operators of all transactions
	 */
	public String toString () 
	{
		String temp = "";
		int index = 0;
		while (index < transactions.size())
		{
			temp = temp + transactions.get(index) + " ";
			index++;
		}
		return temp;
	}
	/**
	 * Clears the total to zero 
	 * and also clears and sets the transactions to zero.
	 */
	public void clear () 
	{
		total = 0;
		transactions.clear();
		transactions.add(0);
	}
}