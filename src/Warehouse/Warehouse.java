package Warehouse;

public class Warehouse {
    private static final int MAX_NBR = 3;
    private int nbObj = 0;
    private String s;

    public Warehouse(String s) {
        this.s = s;
    }

    public int getNbObj() {
        return this.nbObj;
    }

    public boolean isEmpty() {
        return (this.nbObj == 0);
    }

    public boolean isFull() {
        return (this.nbObj == this.MAX_NBR);
    }

    public String toString() {
        return (" ( " + this.nbObj + " objects) in " + this.s);
    }

    public synchronized void put() {
        try {
            while (isFull()) {
                wait();
                System.out.println("producer aslept");
            }
        } catch (Exception e) {
        }
        this.nbObj++;
        notifyAll();
    }

    public synchronized void take() {
        try {
            while (isEmpty()) {
                wait();
                System.out.println("consumer aslept");
            }
        } catch (Exception e) {
        }
        this.nbObj--;
        notifyAll();
    }
}

