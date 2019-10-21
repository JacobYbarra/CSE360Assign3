package cse360assign3;

import cse360assign3.AddingMachine;

/**
 * A Calculator built off AddingMachine,
 * adds multiply, dividing, and power functionality.
 * @author Jacob Ybarra
 * <p>
 * ASUID: 1213015295
 */
public class Calculator extends AddingMachine
{
    /**
     * The constructor method, creates the object.
     * Calls the parent constructor.
     */
    public Calculator()
    {
        super();
    }
    /**
     * Multiplies an integer value to the total value
     * and stores that value in transactions.
     * @param value the integer amount to multiply by.
     */
    public void mult(int value)
    {
        transactions.add("*");
        transactions.add(value);
        total = total * value;
    }
    /**
     * Divides an intger from the total value
     * and stores an INTEGER value in transactions
     * @param value the integer to divide by
     */
    public void div(int value)
    {
        transactions.add("/");
        transactions.add(value);
        if(value != 0)
        {
            total = total / value;
        }
        else
        {
            total = 0;
        }
    }
    /**
     * Raises the total to the power of an integer value
     * and stores that value in transactions
     * @param value the inger value to raise the power to.
     */
    public void power(int value)
    {
        transactions.add("^");
        transactions.add(value);
        if(value > 0)
        {
            total = (int)Math.pow(total, value);
        }
        else
        {
            total = 0;
        }
    }
}