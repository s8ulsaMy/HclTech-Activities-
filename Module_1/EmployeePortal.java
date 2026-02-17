import java.util.*;

class EmployeeException extends Exception {
    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class EmployeePortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (age < 18 || age > 60) {
                throw new Exception("Age must be between 18 and 60.");
            }
            System.out.println("Employee age verified.");

        } catch (InputMismatchException e) {
            // Exception Wrapping
            try {
                throw new EmployeeException("Invalid input type entered.", e);
            } catch (EmployeeException ex) {
                System.out.println(ex.getMessage() + " | Original Cause: " + ex.getCause());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}