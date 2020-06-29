package methodOverload;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.plus(10, 20));
		System.out.println(cal.plus(10, cal.plus(20, 30)));
		System.out.println(cal.plus(10, 20, 30));
	}
	
	// method
	int plus(int x, int y) {
		return x + y;
	}
	// overload
	int plus(int x, int y, int z) {
		return plus(plus(x,y),z);
	}
	
	int minu(int x, int y) {
		return x - y;
	}
	
	int mux(int x, int y) {
		return x * y;
	}
	
	int div(int x, int y) {
		return x / y;
	}

}
