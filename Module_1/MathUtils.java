/**
 * The MathUtils class provides basic mathematical operations.
 * <p>
 * This class demonstrates how to use Javadoc annotations for 
 * automated documentation generation.
 * </p>
 * * @author Gemini
 * @version 1.0
 */
public class MathUtils {

    /**
     * Adds two integers together and returns the sum.
     * * @param a The first number to be added.
     * @param b The second number to be added.
     * @return The arithmetic sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Divides the first number by the second.
     * * @param dividend The number being divided.
     * @param divisor The number to divide by.
     * @return The result of the division as a double.
     * @throws ArithmeticException If the divisor is zero.
     */
    public double divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) dividend / divisor;
    }
}