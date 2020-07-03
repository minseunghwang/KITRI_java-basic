package nestedClass;

public class A {
	A(){};
	// 중첩 인터페이스
	interface IB {
		static final double PI = 3.14;
		public abstract void method();
	}
	

	
	// 인스턴스 맴버 클래스
	class B{
		int field;
		// static int static field
		void method() {}
		// static void methodStatic() {}
	}
	
	static class C {
		int field;
		static int staticfield;
		void method() {}
		static void methodStatic() {}
	}
	
	void method() {
		class D{
			int field;
			//static int staticfield;
			void method() {}
			// static void main
		}
		D d = new D();
		d.field = 3;
		d.method();
	}
}
