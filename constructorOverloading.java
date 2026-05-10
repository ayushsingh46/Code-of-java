class Smartphone {
    String brand;
    String model;
    int storage;

    // 1. Default Constructor (No-arg)
    public Smartphone() {
        this.brand = "Unknown";
        this.model = "Generic";
        this.storage = 0;
        System.out.println("Default Constructor Called: Device initialized with placeholder values.");
    }

    // 2. Parameterized Constructor
    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.storage = 128; // Default storage if not specified
        System.out.println("Parameterized Constructor (2 args) Called.");
    }

    // 3. Constructor Overloading (3 parameters)
    public Smartphone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        System.out.println("Parameterized Constructor (3 args) Called.");
    }

    void displayDetails() {
        System.out.println("Device: " + brand + " " + model + " | Storage: " + storage + "GB");
        System.out.println("-------------------------------------------------");
    }
}

public class constructorOverloading {
    public static void main(String[] args) {
        // Invoking Default Constructor
        Smartphone device1 = new Smartphone();
        device1.displayDetails();

        // Invoking Parameterized Constructor
        Smartphone device2 = new Smartphone("Apple", "iPhone 15");
        device2.displayDetails();

        // Invoking Overloaded Constructor
        Smartphone device3 = new Smartphone("Samsung", "S24 Ultra", 512);
        device3.displayDetails();
    }
}
