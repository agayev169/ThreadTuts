package TicTac;

public class TicTac3  {

	public static void main (String[] args) 
	{
		Thread tic = new TestThread3("TIC");
		Thread tac = new TestThread3("TAC");
		tic.start();
		tac.start();
		try {
		    tic.join();
		}
		catch(InterruptedException e) {}
		System.out.println("it's over");
	}
}


