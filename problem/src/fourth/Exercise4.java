package fourth;

public class Exercise4 {

	static boolean isNumber(String str) {
		for (int i=0; i<str.length(); i++) {
			char a = str.charAt(i);
			if (a<='0' || a>'9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

}
