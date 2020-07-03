package p417;

import p417.Car.Engine;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Engine();
	}
}
