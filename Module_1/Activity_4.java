import java.util.Scanner;

public class Activity_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRetailValue = 0;
        String input;

        System.out.println("Shopkeeper Sales System");
        System.out.println("Available Products: 1 (A), 2 (B), 3 (C). Enter 'exit' to finish.");

        while (true) {
            System.out.print("\nEnter Product Number or Code: ");
            input = scanner.next().toUpperCase(); // Handles case sensitivity

            if (input.equals("EXIT")) {
                break;
            }

            System.out.print("Enter Quantity Sold: ");
            int quantity = scanner.nextInt();

            // Use a switch statement to determine retail price
            switch (input) {
                case "1":
                case "A":
                    totalRetailValue += 22.50 * quantity;
                    break;
                case "2":
                case "B":
                    totalRetailValue += 44.50 * quantity;
                    break;
                case "3":
                case "C":
                    totalRetailValue += 9.98 * quantity;
                    break;
                default:
                    System.out.println("Invalid product identifier. Please try again.");
                    continue;
            }
            
            System.out.printf("Current Total: $%.2f%n", totalRetailValue);
        }

        System.out.printf("\nFinal Total Retail Value: $%.2f%n", totalRetailValue);
        scanner.close();
    }
}