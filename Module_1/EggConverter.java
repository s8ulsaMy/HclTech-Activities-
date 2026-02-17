import java.util.Scanner;

public class EggConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total number of eggs: ");
        int totalEggs = sc.nextInt(); //

        // Calculate Gross (total / 144)
        int gross = totalEggs / 144;
        int remainingAfterGross = totalEggs % 144;

        // Calculate Dozens from what is left (remaining / 12)
        int dozens = remainingAfterGross / 12;
        
        // Calculate remaining eggs (remaining % 12)
        int leftOver = remainingAfterGross % 12;

        // - Display results
        System.out.println("Your number of eggs is " + gross + " gross, " 
                           + dozens + " dozen, and " + leftOver + ".");
    }
}