package operator;

public class Operator_Ex1 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		
		double c = 10.0;
		double d = 6.1;
		double e = 0.2;
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c/d);
		System.out.println(c*d);
		System.out.println(c%d);
		
		System.out.println(d-e);
		int intd = (int)(d*10);
		int inte = (int)(e*10);
		
		System.out.println(intd);
		System.out.println(inte);
		System.out.println(intd-inte);
		System.out.println(((intd-inte)/10) + ((intd-inte)%10)*0.1);
		

	}

}
