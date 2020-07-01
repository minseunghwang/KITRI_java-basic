package car;

public class Car {
	int MAX_SPEED = 300;
	int MAX_GAS = 40;
	private int speed;
	private int gas;
	private boolean power;

	Car() {
		System.out.println("Car() 생성자");
	}

	Car(String str) {
		System.out.println("CAR (" + str + ")");
	}
	
	String engine = "부릉";
	
	boolean powerCheck() {
		return power;
	}
	
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void powerChange() {
		if (power) {
			power = false;
			System.out.println("시동 off");
		} else {
			power = true;
			System.out.println("시동 on");
		}
	}

	void insertGas() {
		gas = MAX_GAS;
		System.out.println("기름 충전");
	}

	void run() {
		if (speed + 50 <= MAX_SPEED && gas > 0) {
			speed += 50;
			gas -= 5;
			System.out.println("속도 증가, 현재 속도 : " + speed);
		} else if(gas == 0){
			System.out.println("기름이 없다.");
		} else {
			System.out.println("최고 속도 입니다.");
		}
	}

	void stop() {
		if (speed - 100 >= 0) {
			speed -= 100;
			System.out.println("브레이크, 현재속도 : " + speed);
		} else {
			System.out.println("정지상태다리.");
		}
	}

	void printCarCheck() {
		System.out.print("차량상태 : " + power + " ");
		System.out.print("현재속도 : " + speed + " ");
		System.out.print("남은기름 : " + gas + " ");
		System.out.println();
	}

}
