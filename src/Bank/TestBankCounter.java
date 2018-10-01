package Bank;

public class TestBankCounter {

    public static void main(String[] args) {
        JointBankAccount anAccount = new JointBankAccount("Bob", "Alice", "123456");
        BankCounter bc1 = new BankCounter(anAccount, 1);
        BankCounter bc2 = new BankCounter(anAccount, 2);
        bc1.start();
        bc2.start();
        try {
            bc1.join();
            bc2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(anAccount);

    }
}

