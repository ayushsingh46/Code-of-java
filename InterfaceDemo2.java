// Interface 1: For devices that can turn on and off
interface Switchable {
    // Implicitly public, static, and final constant
    String VOLTAGE_RATING = "240V"; 

    // Abstract method (No body)
    void turnOn();
    void turnOff();

    // Default method (Has a body, subclasses can optionally override it)
    default void reset() {
        System.out.println("System rebooting to factory defaults at " + VOLTAGE_RATING + "...");
    }
}

// Interface 2: For devices that connect to the internet
interface InternetConnected {
    void connectToWiFi(String networkName);

    // Static method (Belongs to the interface, cannot be overridden)
    static boolean checkSignalStrength(int dbm) {
        return dbm > -70; // True if signal is acceptable
    }
}

// Concrete Class implementing MULTIPLE interfaces
class SmartLight implements Switchable, InternetConnected {
    private String location;
    private int brightness = 0;

    public SmartLight(String location) {
        this.location = location;
    }

    // Must implement Switchable methods
    @Override
    public void turnOn() {
        this.brightness = 100;
        System.out.println(location + " Light turned ON at " + brightness + "% brightness.");
    }

    @Override
    public void turnOff() {
        this.brightness = 0;
        System.out.println(location + " Light turned OFF.");
    }

    // Must implement InternetConnected method
    @Override
    public void connectToWiFi(String networkName) {
        System.out.println(location + " Light connected successfully to: " + networkName);
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        // Create an instance of the concrete class
        SmartLight livingRoomLight = new SmartLight("Living Room");

        // 1. Using standard interface methods
        livingRoomLight.turnOn();
        livingRoomLight.connectToWiFi("Home_Mesh_5G");

        System.out.println("---");

        // 2. Calling the default method inherited from Switchable
        livingRoomLight.reset();

        System.out.println("---");

        // 3. Calling the static method directly from the interface
        int currentSignal = -65;
        boolean isConnected = InternetConnected.checkSignalStrength(currentSignal);
        System.out.println("Is WiFi signal good? " + isConnected);
        
        livingRoomLight.turnOff();
    }
}
