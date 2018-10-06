package Counter;

public class Counter extends Thread {
    private String name; // Name of the Thread
    private CounterPrinter cp; // CounterPrinter to print values from 0 to n
    private int maxCount; // The value of n
    private static int count = 0; // Static counter to know the order of finish


    public Counter(String name, CounterPrinter cp, int maxCount) { // Constructor
        this.name = name;
        this.cp = cp;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        synchronized (cp) { // Synchronizing CounterPrinter to Count to maxCount without interruption (2nd problem)
            cp.count(name, maxCount); // Count!
            System.out.println(name + " finished #" + count); // Finish message
            count++; // Incrementing counter for the next Counter
        }
    }
}

class CounterPrinter extends Thread { // CounterPrinter to print values from 0 to n
    void count(String name, int maxCount) {
        for (int i = 0; i < maxCount; i++) { // Loop to print the values
            System.out.println("Counter name: " + name + ", " + i); // Print The value
            try {
                sleep((long) (Math.random() * 5000)); // Sleep some time between 0 and 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}