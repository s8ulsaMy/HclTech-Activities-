class TollBooth {
    // synchronized ensures only one vehicle is dealt with at a time
    public synchronized void cross(int vehicleNumber) {
        System.out.println("Vehicle " + vehicleNumber + " is crossing the bridge.");
        System.out.println("Vehicle " + vehicleNumber + " has crossed the toll booth.");
    }
}

public class HighwaySimulation {
    public static void main(String[] args) {
        TollBooth booth = new TollBooth();

        for (int i = 1; i <= 5; i++) {
            final int vehicleId = i;
            new Thread(() -> booth.cross(vehicleId)).start();
        }
    }
}