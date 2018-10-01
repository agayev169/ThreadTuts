package TicTac;

public class TestThread3 extends Thread {

	private String s;

	public TestThread3(String s) {
        this.s = s;
    }

	public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.print(s + "  ");
				try {
				    sleep(100);
				}
				catch(InterruptedException e) {
				    e.printStackTrace();
				}
        }
	}
}


