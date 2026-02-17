package stock;

public class Inheritance_3 {

    int quantity;
    int lowOrderLevelQuantity;

    public Inventory(int quantity, int lowOrderLevelQuantity) {
        this.quantity = quantity;
        this.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }

    public void display() {
        System.out.println("Quantity: " + quantity);
        System.out.println("Low Order Level Quantity: " + lowOrderLevelQuantity);
    }

    public static void main(String[] args) {
        Inheritance_3 obj = new Inheritance_3(100, 20);
        obj.display();
    }
}