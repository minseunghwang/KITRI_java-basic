package staticExample;

public class StaticFinalExample {
	
	static final double PI = 3.14;		// 한번 정의되면 변경 no
	static final String MONDAY = "MONDAY";
	static final String TUESDAY = "TUESDAY";
	//....
	static final String SUNDAY = "SUNDAY";
	
	
	public static void main(String[] args) {
		final int a = 10;
//		a = 20;
		System.out.println(a);
	}
	
	static void plus(final int[] arr) {
		System.out.println(PI);
	}
}
