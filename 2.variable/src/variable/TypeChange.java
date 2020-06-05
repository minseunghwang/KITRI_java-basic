package variable;

public class TypeChange {

	public static void main(String[] args) {
		int a = 10;
		double b = 20.2;
		double c = 20;
		double result = 0;
	
		// 자동 형변환
		result = a + b;		// 4byte + 8byte = 8byte
		System.out.println(result);
		
		result = a + c;
		System.out.println(result);
		
		// 강제 형변환
		result = (double)a + b;
		System.out.println(result);
		
		int resultInt = (int)(a + b);		// int + double = int
		System.out.println(resultInt);
				
	}

}
