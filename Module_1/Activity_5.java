import java.util.Scanner;

public class Activity_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalRetailValue = 0;
        
        System.out.println("Enter Product (1/A, 2/B, 3/C) and Quantity. Enter '0' to stop.");

        while (true) {
            System.out.print("Product: ");
            String product = sc.next().toUpperCase(); // - Handles case insensitivity
            
            if (product.equals("0")) break;

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            // - Switch statement to determine price
            switch (product) {
                case "1": case "A":
                    totalRetailValue += 22.50 * quantity;
                    break;
                case "2": case "B":
                    totalRetailValue += 44.50 * quantity;
                    break;
                case "3": case "C":
                    totalRetailValue += 9.98 * quantity;
                    break;
                default:
                    System.out.println("Invalid Product!");
            }
        }
        System.out.printf("Total Retail Value: $%.2f\n", totalRetailValue);
    }
}