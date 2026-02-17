import java.util.Scanner;

public class Activity_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Logic to swap without a temporary variable
        a = a + b; // a now holds the sum of both
        b = a - b; // (sum - b) gives the original a, assigned to b
        a = a - b; // (sum - original a) gives original b, assigned to a

        System.out.println("After swapping: a = " + a + ", b = " + b);
        scanner.close();
    }
}