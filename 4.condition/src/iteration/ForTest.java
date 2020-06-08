package iteration;

public class ForTest {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " ");
		}
		System.out.println("-----------------");
		for (int i = 10; i > 0; i--) {
			System.out.println(i + " ");
		}
		System.out.println("-----------------");
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("-----------------");
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		System.out.println("-----------------");
		for (int i = 1; i <= 40; i++) {
			String answer = "";
			if (((i % 10) % 3 == 0) && (i % 10 != 0)) {
				answer += "짝";
				if (((i - (i % 10)) % 3) == 0 && i>=10) {
					answer += "짝";
				}
			} else
				answer += Integer.toString(i);
			System.out.println(i + ":" + answer);
		}
	}

}
