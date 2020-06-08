package second;

class Exercise3_3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=10; i++) {
			int temp = 0;
			for (int j=1; j<=i; j++) {
				temp += j;
			}
			sum += temp;			
		}
		System.out.println(sum);			
	}
}
