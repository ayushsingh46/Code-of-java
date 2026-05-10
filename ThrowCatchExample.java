public class ThrowCatchExample {

    // Method that throws an exception
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above. You entered: " + age);
        }
        System.out.println("Access granted! Age: " + age);
    }

    public static void main(String[] args) {

        // Example 1: Catching a custom thrown exception
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Example 2: Valid age — no exception thrown
        try {
            checkAge(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Example 3: Catching arithmetic exception (divide by zero)
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs!");
        }

    }
}