package Bank;

public class JointBankAccount {
    private String nameM;
    private String nameW;
    private String accountNbr;
    private int balance = 0;

    public JointBankAccount(String sM, String sW, String aNbr) {
        this.nameM = sM;
        this.nameW = sW;
        this.accountNbr = aNbr;
    }

    public String toString() {
        return ("The bank account number " + this.accountNbr + " has a balance of " + this.balance + " euros");
    }

    public synchronized void deposit(int amount) {
        int result = this.balance;
        try {
            Thread.sleep(100);
        } //processing time
        catch (Exception e) {
            e.printStackTrace();
        }
        this.balance = amount + result;
        System.out.println("deposit of " + amount + " euros");
    }

}			
