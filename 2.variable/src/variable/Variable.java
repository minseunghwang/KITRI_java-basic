package variable;

public class Variable {
	public static void main(String[] args) {
		// 논리형 1byte = 8bit 0000 0000b = 2^8 = 256
		boolean bo1 = true;
		boolean bo2 = false;
		
		//문자형 2byte
		char ch = 'a';
		char ch1 = 97;
		
		System.out.println(ch);
		System.out.println(ch1);
		
		//숫자형 - 정수형
		byte by = 0;	// 1byte	-128 ~ 127
		short sh = 0;	// 2byte
		int in = 0;		// 4byte = 32bit
		long lo = 0;	// 8byte
		
		int a = 10;		// 10진수
		int a8 = 010;	// 8진수 8
		int a16 = 0x10;	// 16진수 10
		
		by = (byte)127;
		by = 127;
		
		in = 1 + 2; 	// 4byte + 4byte = 4byte
		lo = 1l + 2l;	// 8bytet + 8byte = 8byte
		
		//숫자형 - 실수형
		float f1 = 1.1f;	// 4byte
		double du = 1.1;	// 8byte
		
		f1 = 1.2f;
		f1 = (float)1.2;
		
		du = 1.0 + 2.0; 	// 8byte + 8byte = 8byte
	}
}
