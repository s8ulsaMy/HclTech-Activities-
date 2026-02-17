import java.util.Scanner;

public class AppUser {
    // Static fields shared by all users
    static String dbUrl;
    static String propertyFileName;
    
    // Instance fields unique to each user
    String username;
    String password;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void displayDetails() {
        System.out.println("--- User Details ---");
        System.out.println("DB URL: " + dbUrl);
        System.out.println("File: " + propertyFileName);
        System.out.println("User: " + username);
        System.out.println("Pass: " + password);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Database URL: ");
        AppUser.dbUrl = sc.nextLine();
        System.out.print("Enter Property File Name: ");
        AppUser.propertyFileName = sc.nextLine();
        
        AppUser user1 = new AppUser("sam_admin", "admin123");
        AppUser user2 = new AppUser("guest_user", "guest456");

        user1.displayDetails();
        user2.displayDetails();
        
        sc.close();
    }
}