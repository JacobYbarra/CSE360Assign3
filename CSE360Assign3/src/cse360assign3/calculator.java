package cse360assign3;

/**
 * A Calculator built off AddingMachine,
 * adds multiply, dividing, and power functionality.
 * @author Jacob Ybarra
 * <p>
 * ASUID: 1213015295
 */
public class calculator extends addingMachine
{
    /**
     * The constructor method, creates the object.
     * Calls the parent constructor.
     */
    public calculator()
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
     * and stores an INTEGER value in transactions.
     * If the total is divided by zero, then the result is zero.
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
     * and stores that value in transactions.
     * If the total is raised to a negative power, then the result is zero.
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