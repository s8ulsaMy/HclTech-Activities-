import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string for your password: ");
        String baseString = sc.nextLine();

        // Creating a thread to handle password generation
        Thread passwordThread = new Thread(() -> {
            Random rand = new Random();
            int randomNumber = rand.nextInt(1000); // Generates 0-999
            String password = baseString + randomNumber;
            System.out.println("Generated Password: " + password);
        });

        passwordThread.start();
        sc.close();
    }
}