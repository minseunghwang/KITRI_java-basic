package problemExample_279p;

public class PrinterExample {

	public static void main(String[] args) {
//		Printer printer = new Printer();		// class에서 static으로 하면 객체 생성 안해도 되는군!
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}
}
