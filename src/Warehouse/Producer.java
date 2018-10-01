package Warehouse;

public class Producer extends Thread {
    private Warehouse e;
    private String nom;

    public Producer(Warehouse w, String s) {
        this.e = w;
        this.nom = s;
    }

    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("before Warehouse.Producer there are " + e);
            e.put();
            System.out.println("after Warehouse.Producer there are " + e);
        }

    }
}


