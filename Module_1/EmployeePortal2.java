import java.util.*; // Fixes Scanner and InputMismatchException errors

// Custom Exceptions
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) { super(msg); }
}
class DuplicateNameException extends Exception {
    public DuplicateNameException(String msg) { super(msg); }
}

// Ensure class name matches filename: EmployeePortal2.java
public class EmployeePortal2 { 
    private static Set<String> existingNames = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (existingNames.contains(name)) throw new DuplicateNameException("Name already exists!");

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine()); 
            if (age < 18 || age > 60) throw new InvalidAgeException("Age must be between 18 and 60.");

            existingNames.add(name);
            System.out.println("Employee Registered Successfully.");

        } catch (NumberFormatException | InputMismatchException e) {
            // Exception Wrapping as requested in Slide 61
            throw new RuntimeException("Input Error: Please enter valid data types.", e);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            sc.close(); // Good practice for resource management
        }
    }
}