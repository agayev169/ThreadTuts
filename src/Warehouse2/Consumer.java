package Warehouse2;

public class Consumer extends Thread {
    private Warehouse e;
    private String nom;

    public Consumer(Warehouse w, String s) {
        this.e = w;
        this.nom = s;
    }

    public void run() {
        try {
            for (int i = 1; i <= 4; i++)
                synchronized (this.e) {
                    while (this.e.isEmpty()) {
                        this.e.wait();
                    } // e locks the access of the Warehouse2.Warehouse.Consumer
                    System.out.println("before Warehouse2.Warehouse.Consumer there are " + this.e);
                    this.e.take();
                    System.out.println("after Warehouse2.Warehouse.Consumer there are " + this.e);
                    this.e.notifyAll();
                }
        } catch (Exception ex) {
        }

    }
}


