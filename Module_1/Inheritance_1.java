public class Inheritance_1 {

    // Making these static allows them to be instantiated in the static main method
    static class Vehicle {
        void start() {
            System.out.println("Vehicle starts");
        }

        void stop() {
            System.out.println("Vehicle stops");
        }
    }

    static class Truck extends Vehicle {
        void loadGoods() {
            System.out.println("Truck is loading goods");
        }
    }

    static class Bus extends Vehicle {
        void carryPassengers() {
            System.out.println("Bus is carrying passengers");
        }
    }

    static class Car extends Vehicle {
        void playMusic() {
            System.out.println("Car is playing music");
        }
    }

    public static void main(String[] args) {
        // Now these will work without the "non-static variable" error
        Truck t = new Truck();
        t.start();
        t.loadGoods();

        Bus b = new Bus();
        b.start();
        b.carryPassengers();

        Car c = new Car();
        c.start();
        c.playMusic();
    }
}