package userException;

public class Account {

	private int balance = 10000;

	public boolean withdraw(int money) {
		boolean result = false;

		try {
			if (balance >= money) {
				System.out.println(money + "를 출금합니다.");
			} else {
				throw new BalanceException("잔고가 없습니다.");
			}
		} catch (BalanceException be) {
			be.printStackTrace();
			System.out.println("돈이 없다리.");
		}
		return result;
	}
}
