class Account {
    int id;
    double balance = 5000;
    Account(int id) { this.id = id; }
}

public class BankDeadlockAvoidance {
    public static void transfer(Account from, Account to, double amount) {
        // Order locks by ID to prevent deadlock
        Account first = from.id < to.id ? from : to;
        Account second = from.id < to.id ? to : from;

        synchronized (first) {
            synchronized (second) {
                if (from.balance >= amount) {
                    from.balance -= amount;
                    to.balance += amount;
                    System.out.println("Transferred " + amount + " from " + from.id + " to " + to.id);
                }
            }
        }
    }

    public static void main(String[] args) {
        Account acc1 = new Account(11111111);
        Account acc2 = new Account(22222222);

        new Thread(() -> transfer(acc1, acc2, 500)).start();
        new Thread(() -> transfer(acc2, acc1, 300)).start();
    }
}