package operator;

public class quiz03_120p {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		double z = x % y;
		System.out.println(z);
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
	}
}
