package InterfacePackage;

interface InterfaceA{
	// 상수, 추상메서드
	double PI = 3.14; 
	public void sayHello();
	
	public default void sayGoodBye() {
		System.out.println("Goodbye");
	}
	
	public static void saySeeYou() {
		System.out.println("See you");
	}
}

interface InterfaceB{
	// 상수, 추상메서드
	public abstract void sayHi();
}

public class InterfaceExample implements InterfaceA, InterfaceB{
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
	
	@Override
	public void sayHi() {
		System.out.println("HI");
	}
}