package Warehouse;

public class Consumer extends Thread {
    private Warehouse e;
    private String nom;

    public Consumer(Warehouse w, String s) {
        this.e = w;
        this.nom = s;
    }

    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("before Warehouse.Consumer there are " + e);
            e.take();
            System.out.println("after Warehouse.Consumer there are " + e);
        }

    }
}


