package problemExample_279p;

public class Printer {
	static void println(int m) {		// static을 붙이면 메모리에 먼저(?) 올라가기 때문에 main에서 객체 생성하지 않고 호출 가능		// Printer.println(10) 이런식으로
		System.out.println(m);
	}
	static void println(boolean m) {
		System.out.println(m);
	}
	static void println(double m) {
		System.out.println(m);
	}
	static void println(String m) {
		System.out.println(m);
	}
	
}
