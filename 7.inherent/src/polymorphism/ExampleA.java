package polymorphism;

public class ExampleA {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		E e = new E();
		
		a2 = new B();
		a3 = new C();
		a4 = new D();
		a5 = new E();
		
		e = (E)new A();	// A - C - E 순으로 상속되기때문에 강제 형변환 가능
		e = (E)new C();	// A - C - E 순으로 상속되기때문에 강제 형변환 가능
//		e = (E)new B();	// A - B - D 순으로 상속이라 연관이없다. 에러
//		e = (E)new D();
	}
}
