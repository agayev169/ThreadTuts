package Supervised;

public class MyObject {
    public MyObject() {
    }

    public synchronized void action1(MyObject o) {
        try {
            Thread.currentThread().sleep(200);
        } catch (InterruptedException e) {
            return;
        }
        o.action2(this);
    }

    public synchronized void action2(MyObject o) {
        try {
            Thread.currentThread().sleep(200);
        } catch (InterruptedException e) {
            return;
        }
        o.action1(this);
    }

}


