package operator;

public class Operator_Ex2 {

	public static void main(String[] args) {
		int a = 10;
		int b = -a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("a : " + a);
		
		// 대입연산자 = += -= *= /= %= &= ^= >>=
		a = a + 10;
		System.out.println("a : " + a);
		a += 10;
		System.out.println("a : " + a);
		
		// 증감연산자 ++ --
		a++;
		System.out.println("a++ : " + a);
		System.out.println(a++);
		System.out.println(++a);
		
		int x = 0;
		int y = 0;
		int z = x++ + ++ x;
		
		System.out.println(x);
		System.out.println(z);
		
		x = 10;
		y = 10;
		
		z = ++x + ++y;
		System.out.println(z);
		System.out.println(x++ + ++y);
		
		a = 30;
		b = 20;
		boolean bool = true ;
		
		bool = (b>a);		// false
		System.out.println(bool);
		
		// 비교연산자 > < >= <= == !=
		bool = (a==b);
		System.out.println(bool);
		
		bool = (a != b);		// true
		System.out.println(bool);
		
		// 논리연산자 AND (& &&), OR(| ||), NOT(!)
		bool = (a!=b)&&(a!=0); // true true
		System.out.println(bool);
		
		boolean b1 = (a>b) || (a<b);
		boolean b2 = (a<=b) && (a!=b);
		boolean b3 = (a>0) | (a!=b);
		boolean b4 = (a==b) & (a!=b);
		boolean b5 = !(a<=b);
		
		System.out.println(b1);
		

	}

}
