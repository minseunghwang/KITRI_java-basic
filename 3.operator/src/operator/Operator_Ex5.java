package operator;

public class Operator_Ex5 {

	public static void main(String[] args) {
		// 비트 연산자 and(&) or(|) nor(^) not(~)
//		3 => 0011b
//		2 => &0010b
//				001b : 2
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a^b);	//2
		System.out.println(c);
		
		// 3 => 0011b
		// 		011b => 6
		//		1100b => 12
		
		byte d = (byte)(a<<1);
		System.out.println(d);
		d = (byte)(a<<2);
		System.out.println(d);
		
//		byte e = (byte)(-8 >);
//		System.out.println();
		
		int student = 40;
		System.out.println(student >=90 ? 'A':student>=80 ? 'B': student >=70 ? 'C': student >=60 ? 'D' : 'F');
		
		int number = 11;
		boolean check = (number%2 == 0 ? true:false);
		System.out.println(check);
				
		
		

	}

}
