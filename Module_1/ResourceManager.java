public class ResourceManager {
    public void processData() {
        Object heavyObject = new Object();
        try {
            System.out.println("Processing object...");
            // Simulate logic
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            // Resetting to null in all cases
            heavyObject = null;
            System.out.println("Object reference reset to null.");
        }
    }
}