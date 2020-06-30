package pb;

public class B {
	void methodB() {
		System.out.println("pb.methodB()");
	}
}

class C{
	void methodC() {
		B b = new B();
	}
}
