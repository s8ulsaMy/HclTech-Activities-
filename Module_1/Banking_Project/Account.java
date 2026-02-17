package Banking_Project;
/**
 * Base Account class with static members and constants.
 */
public class Account {
    // Constants for interest rates
    public static final double SAVINGS_RATE = 4.0;
    public static final double RECURRING_RATE = 6.5;
    public static final double FIXED_RATE = 7.5;

    private static int idCounter = 1000;
    protected String accountNumber;
    protected double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(double balance) {
        this(); // Calls no-arg constructor
        this.balance = balance;
    }

    // Static method for account generation
    public static String generateAccountNumber() {
        return "HCL" + (++idCounter);
    }
}

// Subclasses for instanceof checks
class SavingsAccount extends Account { public SavingsAccount(double b) { super(b); } }
class RecurringAccount extends Account { public RecurringAccount(double b) { super(b); } }
class FixedAccount extends Account { public FixedAccount(double b) { super(b); } }