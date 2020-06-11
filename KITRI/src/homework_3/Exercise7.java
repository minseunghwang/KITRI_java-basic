package homework_3;

class Exercise7 {
	public static void main(String args[]) {
		int[] coinUnit = { 500, 100, 50, 10 };
		int[] needcoin = new int[4];
		int money = 2680;
		System.out.println("money=" + money);
		
		int cnt = 0;
		for (int i = 0; i < coinUnit.length; i++) {
			cnt = money / coinUnit[i];
			needcoin[i] = cnt;
			money -= cnt * coinUnit[i];
		}
		
		for (int i=0; i<4; i++) {
			System.out.printf("%d¿ø : %d", coinUnit[i], needcoin[i]);
			System.out.println();
		}
	}
}