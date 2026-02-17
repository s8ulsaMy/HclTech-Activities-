import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculatorWithExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));
            // ArithmeticException handled here if num2 is 0
            System.out.println("Division: " + (num1 / num2));

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            sc.close();
        }
    }
}