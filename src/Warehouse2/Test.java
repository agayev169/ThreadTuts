package Warehouse2;

public class Test {
    public static void main(String[] args) {
        Warehouse e = new Warehouse("warehouse 1");
        Producer p = new Producer(e, "producer");
        Consumer c = new Consumer(e, "consumer");
        p.start();
        c.start();
        try {
            p.join();
            c.join();
        } catch (Exception ex) {
        }
        System.out.println("end " + e);
    }
}

