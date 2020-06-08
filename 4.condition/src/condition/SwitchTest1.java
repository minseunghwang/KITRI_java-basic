package condition;

public class SwitchTest1 {

	public static void main(String[] args) {
		int code = 12;

		switch (code / 10) {
		case 1:
			System.out.println("내국인");
			switch (code % 10) {
			case 1:
				System.out.println("남자");
				break;
			case 2:
				System.out.println("여자");
				break;
			default:
				System.out.println("ID 오류");
			}
			break;
		case 2:
			System.out.println("외국인");
			switch (code % 10) {
			case 1:
				System.out.println("남자");
				break;
			case 2:
				System.out.println("여자");
				break;
			default:
				System.out.println("ID 오류");
			}
		}

	}

}
