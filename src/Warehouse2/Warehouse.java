package Warehouse2;

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
        return (" ( " + this.nbObj + " objets) in " + this.s);
    }

    public synchronized void put() {
        this.nbObj++;
    }

    public synchronized void take() {
        this.nbObj--;
    }
}

