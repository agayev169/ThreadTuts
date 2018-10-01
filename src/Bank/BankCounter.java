package Bank;

public class BankCounter extends Thread {
    private JointBankAccount cj;
    private int id;

    public BankCounter(JointBankAccount ba, int n) {
        this.cj = ba;
        this.id = n;
    }

    public void run() {
        System.out.println("start of transaction on " + this.cj + " at counter number " + this.id);
        this.cj.deposit(100);
        System.out.println("end of transaction on " + this.cj + " at counter number " + this.id);
    }
}




