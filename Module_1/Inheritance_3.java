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
}
