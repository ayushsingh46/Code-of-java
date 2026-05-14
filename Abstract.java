// Abstract Class
abstract class Payment {
    double amount;

    // Regular Constructor
    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method (does not have a body)
    // Subclasses MUST implement this
    abstract void authorize();

    // Regular method (Concrete method)
    void receipt() {
        System.out.println("Processing receipt for: $" + amount);
    }
}

// Subclass 1
class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void authorize() {
        System.out.println("Authorizing Credit Card: " + cardNumber);
    }
}

// Subclass 2
class UPIPayment extends Payment {
    String upiId;

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void authorize() {
        System.out.println("Authorizing UPI Payment for ID: " + upiId);
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Payment p = new Payment(100); // Error: Cannot instantiate abstract class
        // updating for new commit and push

        Payment p1 = new CreditCardPayment(250.0, "1234-5678-9012");
        p1.authorize();
        p1.receipt();

        System.out.println("---");

        Payment p2 = new UPIPayment(50.0, "user@okbank");
        p2.authorize();
        p2.receipt();
    }
}