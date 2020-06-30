package problemExample_279p;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int cnt = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String a_num = scanner.next();

		System.out.print("계좌주 : ");
		String a_name = scanner.next();

		System.out.print("초기입금액 : ");
		int f_input = scanner.nextInt();

		Account account = new Account(a_num, a_name, f_input);
		accountArray[cnt] = account;
		cnt += 1;

		System.out.println("결과 : 계좌가 생성되었습니다.");
	}

	// 계좌 목록보기
	private static void accountList() {
		for (int i = 0; i < cnt; i++) {
			System.out.println("계좌번호 : " + accountArray[i].getAno() + " | " + "계좌주 : " + accountArray[i].getOwner()
					+ " | " + "잔액 : " + accountArray[i].getBalance());
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.print("계좌번호를 입력하시오 : ");
		String account_num = scanner.next();

		Account ac = null;
		for (Account tmpac : accountArray) {
			if (tmpac != null && tmpac.getAno().equals(account_num)) {
				ac = tmpac;
				break;
			}
		}

		if (ac != null) {
			System.out.print("예금할 금액 : ");
			int input_money = scanner.nextInt();

			ac.setBalance(ac.getBalance() + input_money);

			System.out.println("계좌 상태");
			System.out.println(
					"계좌번호 : " + ac.getAno() + " | " + "계좌주 : " + ac.getOwner() + " | " + "잔액 : " + ac.getBalance());
		} else {
			System.out.println("계좌번호를 잘못 입력해쎳다");
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.print("계좌번호를 입력하시오 : ");
		String account_num = scanner.next();

		Account ac = null;
		for (Account tmpac : accountArray) {
			if (tmpac != null && tmpac.getAno().equals(account_num)) {
				ac = tmpac;
				break;
			}
		}
		if (ac != null) {

			System.out.print("출금할 금액 : ");
			int input_money = scanner.nextInt();

			ac.setBalance(ac.getBalance() - input_money);

			System.out.println("계좌 상태");
			System.out.println(
					"계좌번호 : " + ac.getAno() + " | " + "계좌주 : " + ac.getOwner() + " | " + "잔액 : " + ac.getBalance());
		} else {
			System.out.println("계좌번호를 잘못 입력해쎳다");
		}
	}

	// Account배열에서 ano와 동일한 Account 객체 찾기
	private static void findAccount(String ano) {
		//
	}
}

class Account {
	private String ano;
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
