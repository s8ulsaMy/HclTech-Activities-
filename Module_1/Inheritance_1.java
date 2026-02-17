public class Inheritance_1 {
    class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Truck extends Vehicle {
    void loadGoods() {
        System.out.println("Truck is loading goods");
    }
}

class Bus extends Vehicle {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Car is playing music");
    }
}

public class Main {
    public static void main(String[] args) {
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

}
