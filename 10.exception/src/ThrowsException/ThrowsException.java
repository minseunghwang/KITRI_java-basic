package ThrowsException;

public class ThrowsException {
	public static void main(String[] args) {
		try {
			numberFormat();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception e");
		}
	}
	
	public static void numberFormat() throws Exception{
		
		String data2 = "a100";
		int val2 = Integer.parseInt(data2);
		System.out.println(val2);
		
//		try {
//			String data2 = "a100";
//			int val2 = Integer.parseInt(data2);
//			System.out.println(val2);
//		} catch(Exception e) {
//			System.out.println("error");
//		}
		
	}
}
