package car;

public class BMW extends Car{
	BMW(){
		super("korea");		// 부모 클래스의 생성자가 먼저 돌아야 돼서 super의 위치는 자식클래스에서 가장 앞쪽(위쪽)
		System.out.println("BMW() 생성자");
	}
	
	// (필드) 오버라이드! 부모클래스의 속성을 재정의 해서 쓰는거
	String engine = "부르르르르르릉";
	
	void method() {
		System.out.println(super.engine);		// super. 붙으면 부모것을 돌리겠단? 뜻인듯
		super.run();
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.engine);
		
		BMW bmw = new BMW();
//		System.out.println(bmw.engine);
//		bmw.run();
		bmw.method();
		
		System.out.println("======================");
		
		car.powerChange();
		car.powerChange();
		car.powerChange();
		car.run();
		car.run();
		car.run();
		car.stop();
		car.stop();
		car.run();
		car.printCarCheck();
		car.insertGas();
		car.run();
		car.printCarCheck();
	}
}
