package computer;

public class Example {
	public static void main(String[] args) {
		Jupan jupan = new Jupan();
		Computer com = new Computer();
		Calculator cal = new Calculator();
		
		System.out.println(Calculator.PI);
		System.out.println(com.PI);
		System.out.println(Computer.PI);
		
		System.out.println(cal.areaCircle(20));
		System.out.println(com.areaCircle(20));
		System.out.println(cal.areaCircle(5));
		System.out.println(com.areaCircle(5));
		
		
//		System.out.println(com.plus(10, 20));
	}
}
