package classExample;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.speed);		// class에서 초기와 안해줬는데도 0 나옴('필드 초기화' 되어서 0 잡히네)
		
		Car car2 = new Car("기아");
		Car car3 = new Car("기아", "K7");
		Car car4 = new Car("기아", "K7", "흰색");
		
		System.out.println(car.company + car.model + car.color);
		System.out.println(car2.company + car2.model + car2.color);
		System.out.println(car3.company + car3.model + car3.color);
		System.out.println(car4.company + car4.model + car4.color);

	}
}

class Car{
	// (디폴트)생성자
	Car(){}
	
	// overloading
	Car(String company){
		this.company = company;
	}
	Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	Car(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	// 필드 값
	String company = "현대";
	String model = "제네시스";
	String color = "남청색";
	
	int maxSpeed = 300;
	int speed;
	
	// 메서드
	// 메서드 overloading
	void run() {
		System.out.println();
	}
	
	void run(String company,int speed) {
		System.out.println();
	}
	
//	void run(String model) {
//		System.out.println();
//	}
//	
//	void run(String color) {
//		System.out.println();
//	}
}