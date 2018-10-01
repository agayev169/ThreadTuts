package Counter;

public class Counter extends Thread {
    private String name;
    private CounterPrinter cp;


    public Counter(String name, CounterPrinter cp) {
        this.name = name;
        this.cp = cp;
    }

    @Override
    public void run() {
        synchronized (cp) {
            cp.count(name);
        }
    }
}

class CounterPrinter extends Thread {
    private int maxCount;

    CounterPrinter(int maxCount) {
        this.maxCount = maxCount;
    }

    void count(String name) {
        for (int i = 0; i < maxCount; i++) {
            System.out.println("Counter name: " + name + ", " + i);
            try {
                sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}