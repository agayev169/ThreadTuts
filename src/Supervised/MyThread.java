package Supervised;

public class MyThread extends Thread {
    private MyObject o1, o2;

    public MyThread(MyObject obj1, MyObject obj2) {
        this.o1 = obj1;
        this.o2 = obj2;
    }

    public void run() {
        o1.action1(o2);
    }

}





