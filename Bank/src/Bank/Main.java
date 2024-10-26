package Bank;

public class Main {

	public static void main(String[] args) {
		Customer[] customers = new Customer[100];
		for (int i = 0; i< 100; i++) {
			customers[i] = new Customer();
			customers[i].start();
		}
		
		for (int i = 0; i < 100; i++) {
			try {
				customers[i].join();				
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Bank.money);
	}

}
