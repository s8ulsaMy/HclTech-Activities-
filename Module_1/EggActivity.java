public class EggActivity {
    public static void main(String[] args) {
        Thread ownerThread = new Thread(() -> {
            int totalGain = 0;
            for (int i = 1; i <= 50; i++) { // 100 Rs total / 2 Rs per egg = 50 eggs
                totalGain += 2;
                System.out.println("Hen Laid the Egg - " + i);
                System.out.println("Owner gained Rs " + totalGain);
                try { Thread.sleep(100); } catch (Exception e) {}
            }
        });
        ownerThread.start();
    }
}