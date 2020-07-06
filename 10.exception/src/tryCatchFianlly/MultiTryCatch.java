package tryCatchFianlly;

public class MultiTryCatch {
	public static void main(String[] args) {
		try {
			// ArrayIndexOutOfBoundsException
			String[] data = new String[2];
			for(int i=0; i<3; i++) {
				System.out.println(data[i]);
			}
			
			// NullPointerException
			String data2 = null;
			System.out.println(data.toString());
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}
