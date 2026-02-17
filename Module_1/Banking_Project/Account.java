package Banking_Project;
/**
 * Represents a bank account in the Banking Project.
 * * @author Student
 * @version 1.0
 * Project: Banking System
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    /**
     * No-argument constructor.
     * Initializes a default account with empty strings and zero balance.
     */
    public Account() {
        this.accountNumber = "UNKNOWN";
        this.balance = 0.0;
        this.accountHolderName = "N/A";
    }

    /**
     * Parameterized constructor.
     * * @param accountNumber The unique ID for the account.
     * @param balance The initial deposit amount.
     * @param accountHolderName The name of the person owning the account.
     */
    public Account(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
}