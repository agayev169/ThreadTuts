package Warehouse2;

public class Producer extends Thread {
    private Warehouse e;
    private String nom;

    public Producer(Warehouse w, String s) {
        this.e = w;
        this.nom = s;
    }

    public void run() {
        try {
            for (int i = 1; i <= 4; i++)
                synchronized (this.e) {
                    while (this.e.isFull()) {
                        this.e.wait();
                    } // e locks the access of the Warehouse2.Warehouse.Producer
                    System.out.println("before Warehouse2.Warehouse.Producer there are " + this.e);
                    this.e.put();
                    System.out.println("after Warehouse2.Warehouse.Producer there are " + this.e);
                    this.e.notifyAll();
                }
        } catch (Exception ex) {
        }
    }
}

