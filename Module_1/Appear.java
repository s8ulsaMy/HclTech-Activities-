public class Appear implements Runnable {
    char c[] = {'H', 'E', 'L', 'L', 'O'};

    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.print(c[i++]);
            try {
                // Adds a 1-second delay
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String str[]) {
        Thread t = new Thread(new Appear());
        t.start();
    }
}