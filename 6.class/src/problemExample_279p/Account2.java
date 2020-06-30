package problemExample_279p;

public class Account2 {
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}
}
