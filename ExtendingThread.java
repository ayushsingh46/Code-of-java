// Step 1: Create a class that extends Thread
class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {
        // Code to execute in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        // Step 2: Create instances of your Thread class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Step 3: Start the threads
        thread1.start();
        thread2.start();
    }
}
