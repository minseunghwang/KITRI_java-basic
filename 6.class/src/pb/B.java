package pb;

public class B {
	public B() {}
//	private B() {}		// ? 클래스가 public인데 이렇게하면 private으로 되서 외부에서 못쓰는듯?
	
	int b = 10;
	
	private void methodB() {		// private는 같은 class에서만, public은 걍 전체
		System.out.println("pb.methodB()");
	}
	
	void methodBB() {
		methodB();
	}
}

class C{
	void methodC() {
		B b = new B();
		b.b =  20;
		b.methodB();
	}
}
