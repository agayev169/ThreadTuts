package Counter;

public class TestCounter {
    public static void main(String[] args) {
        CounterPrinter cp = new CounterPrinter(5);
        Counter c1 = new Counter("TIC", cp);
        Counter c2 = new Counter("TAC", cp);
        c1.start();
        c2.start();
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
