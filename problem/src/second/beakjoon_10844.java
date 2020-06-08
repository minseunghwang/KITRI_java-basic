package second;

public class beakjoon_10844 {

	public static void main(String[] args) {
		
		int n = 1;
		int cnt = 0;
		int mn = (int) Math.pow(10, n-1);
		int mx = (int)Math.pow(10, n);
		for (int i = mn; i < mx; i++) {
			int temp = i;
			int num1 = temp % 10;
			temp = temp/10;
			int num2 = temp%10;
			boolean sw = true;	
			while (temp != 0) {
				if (Math.abs(num1-num2) > 1 || num1 == num2) {
					sw = false;
					break;
				}
				num1 = num2;
				temp = temp/10;
				num2 = temp%10;
			}
			if (sw) {
				cnt++;
			}
		}
		System.out.println(cnt % 1000000000);
	}

}
