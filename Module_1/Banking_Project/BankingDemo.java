package Banking_Project;
public class BankingDemo {
    public static void main(String[] args) {
        // Segregating References and Objects
        Account myAccRef; // Reference
        myAccRef = new SavingsAccount(5000.0); // Object

        // Instanceof check
        if (myAccRef instanceof Account) {
            System.out.println("Validated: Object is an instance of Account.");
        }

        System.out.println("New Account Created: " + myAccRef.accountNumber);
        System.out.println("Savings Interest: " + Account.SAVINGS_RATE + "%");
    }
}