package nullPointException;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		String[] data = new String[2];
		data[0] = "0";
		data[1] = "1";

		for(int i=0; i<3; i++) {
			System.out.println(data[i]);
		}
	}
}
