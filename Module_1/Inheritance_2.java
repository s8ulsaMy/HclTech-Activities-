class Vehicle {
    String color, model;
    int wheels;

    Vehicle(String color, int wheels, String model) {
        this.color = color;
        this.wheels = wheels;
        this.model = model;
    }

    void display() {
        System.out.println(color + " " + model + " with " + wheels + " wheels");
    }
}

class Truck extends Vehicle {
    Truck() {
        super("Blue", 6, "Truck");
    }
}

class Bus extends Vehicle {
    Bus() {
        super("Red", 4, "Bus");
    }
}

class Car extends Vehicle {
    Car() {
        super("White", 4, "Car");
    }
}

public class Inheritance_2 {
    public static void main(String[] args) {
        Truck t = new Truck();
        Bus b = new Bus();
        Car c = new Car();

        t.display();
        b.display();
        c.display();
    }
}
