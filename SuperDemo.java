// Parent Class
class Vehicle {
    String type = "Generic Vehicle";

    // Parent Constructor
    Vehicle(String brand) {
        System.out.println("Vehicle Constructor: Brand is " + brand);
    }

    void displaySpeed() {
        System.out.println("Vehicles can travel at various speeds.");
    }
}

// Subclass
class Car extends Vehicle {
    String type = "Sedan Car"; // Hides parent variable

    Car(String brand) {
        // 1. Using super() to call parent constructor
        // Must be the first statement in the constructor
        super(brand); 
        System.out.println("Car Constructor: Specific car initialized.");
    }

    void printTypes() {
        // 2. Using super to access parent variable
        System.out.println("Subclass type: " + type);
        System.out.println("Parent class type (using super): " + super.type);
    }

    @Override
    void displaySpeed() {
        System.out.println("Cars typically travel at 100 km/h.");
    }

    void showWork() {
        // 3. Using super to call parent method
        super.displaySpeed(); // Calls Vehicle's version
        displaySpeed();       // Calls Car's version
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        
        System.out.println("\n--- Type comparison ---");
        myCar.printTypes();
        
        System.out.println("\n--- Method comparison ---");
        myCar.showWork();
    }
}
