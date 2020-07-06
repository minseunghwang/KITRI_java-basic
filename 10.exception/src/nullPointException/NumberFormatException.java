package nullPointException;

public class NumberFormatException {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		int a = 10;
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		
		System.out.println(val1);
		System.out.println(val2);
		
	}
}
