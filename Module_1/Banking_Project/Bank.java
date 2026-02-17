package Banking_Project;
public class Bank {
    private String bankName;
    private static double totalBankBalance = 0;

    public Bank() { this("HCL Bank"); }

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Static method to calculate Bank's balance
    public static void addToTotal(double amount) {
        totalBankBalance += amount;
    }
}