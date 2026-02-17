import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. Palindrome Check
        int temp = num, reversed = 0;
        while (temp > 0) {
            reversed = (reversed * 10) + (temp % 10);
            temp /= 10;
        }
        System.out.println(num + (num == reversed ? " is a palindrome." : " is not a palindrome."));

        // 2. Prime Check
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + "p"); // Append 'p' if prime
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}