package Bank;

class Bank {
	static int money = 0;
	
	static synchronized void addOneYen() {
		money++;
	}
}
