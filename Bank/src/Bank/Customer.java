package Bank;

public class Customer extends Thread {
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Bank.addOneYen();
		}
	}
}
