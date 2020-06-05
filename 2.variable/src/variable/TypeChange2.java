package variable;

public class TypeChange2 {

	public static void main(String[] args) {

		char charValue = 'a';
		int intValue = 1;
		
		intValue = charValue;
//		intValue = (int)charValue;
		
		charValue = '여';
		charValue = '!';
		intValue = charValue;
		
		System.out.println(charValue);
		System.out.println(intValue);
		
		byte byValue = Byte.MAX_VALUE;
		short shValue = Short.MAX_VALUE;
		int inValue = Integer.MAX_VALUE;
		long loValue = Long.MAX_VALUE;
		
		System.out.println(byValue);
		System.out.println(shValue);
		System.out.println(inValue);
		System.out.println(loValue);
		
		// 왼쪽이 더 큰 범위라서 됌
		short s = byValue;
		int i = shValue;
		long l = inValue;
		
		// 오른쪽이 더 커서 안됌
//		byte b = shValue;
//		short s2 = inValue;
//		int i2 = loValue;
				
		

	}

}
