import java.util.Scanner;

public class TimerChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question: What is the capital of India? (You have 1 minute)");

        long startTime = System.currentTimeMillis();
        String answer = sc.nextLine();
        long endTime = System.currentTimeMillis();

        // 60,000 milliseconds = 1 minute
        if ((endTime - startTime) <= 60000) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Better Luck Next Time");
        }
        sc.close();
    }
}