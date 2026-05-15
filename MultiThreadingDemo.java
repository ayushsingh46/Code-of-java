// Task 1: Printing Numbers
class NumberTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i + " (Thread: " + Thread.currentThread().getName() + ")");
            try {
                // Pause for 500ms to simulate work
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Task 2: Printing Letters
class LetterTask implements Runnable {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c + " (Thread: " + Thread.currentThread().getName() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        // Create instances of our tasks
        NumberTask numTask = new NumberTask();
        LetterTask letTask = new LetterTask();

        // Create Thread objects and pass the tasks
        Thread thread1 = new Thread(numTask);
        Thread thread2 = new Thread(letTask);
        
        // Give them names for better tracking
        thread1.setName("NumberThread");
        thread2.setName("LetterThread");

        // Start the threads (This calls the run() method internally)
        thread1.start();
        thread2.start();
        
        // Main thread continues to run
        System.out.println("Main thread is finished, but child threads keep running!");
    }
} 

