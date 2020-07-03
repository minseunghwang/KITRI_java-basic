package nestedClass;

public class Outter {
	String outter = "Outter field";
	NestedClass nc = new NestedClass();
	
	void method() {
		System.out.println("Outter method");
	}
	
	void runNestedClass() {
		nc.nestedMethod();
		System.out.println(nc.nested);
	}
	
	class NestedClass{		// 인스턴스 맴버 클래스 - 외부의 Outter클래스가 객체로 할당이 되어야만 존재한다.
		NestedClass(){}
		String nested = "Nested field";
//		static int staticA = 10;		// 근데 static으로 변수를 올린다 ? 말이안됌(외부의 Outter클래스가 객체로 아직 할당이 안되었기 때문) + static은 코드가 돌기 전 메모리에 먼저 올라감
		
		void nestedMethod() {
			System.out.println("Nested method()");
		}
		
		void nestedStaticMethod() {
			System.out.println("Nested method()");
		}
	}
}

class Outter2{
	Outter out = new Outter();
	
}