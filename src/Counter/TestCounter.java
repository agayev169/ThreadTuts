package Counter;

public class TestCounter {
    public static void main(String[] args) {
        CounterPrinter cp = new CounterPrinter(); // CounterPrinter to print values from 0 to n
        Counter c1 = new Counter("TIC", cp, 5); // Counter1
        Counter c2 = new Counter("TAC", cp, 5); // Counter2
        c1.start(); // Starting Counter1
        c2.start(); // Starting Counter2
        try {
            c1.join(); // Joining Counter1
            c2.join(); // Joining Counter2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
