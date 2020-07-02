package p396;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

class Cat implements Soundable{

	@Override
	public String sound() {
		System.out.println("야옹");
		return null;
	}
}

class Dog implements Soundable{

	@Override
	public String sound() {
		System.out.println("멍멍");
		return null;
	}
}