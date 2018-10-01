package Supervised;

public class Deadlock {

    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyThread t1 = new MyThread(obj1, obj2);
        t1.setName("t1");
        MyThread t2 = new MyThread(obj2, obj1);
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

