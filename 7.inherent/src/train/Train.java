package train;

public class Train {
	final void run() {		// 메소드를 final로 선언하면 상속받은애들이 오버라이딩(재정의)해서 사용할 수 없다.
		System.out.println("Train이 달린다.");
	}
	void smoke() {}
}
