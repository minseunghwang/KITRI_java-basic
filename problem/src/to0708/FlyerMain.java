package to0708;

public class FlyerMain {
	public static void main(String[] args) {
		System.out.println(Flyer.fast);
		Bird b = new Bird();
		FlyerUtil.show(b);

		Airplane ap = new Airplane();
		ap.fly();
		FlyerUtil.show(ap);
		Flyer f = new Bird();
		f.fly();
		System.out.println(f.isAnimal());
		FlyerUtil.show(f);
		Bird bf = (Bird) f;
		FlyerUtil.show(bf);
	}
}

class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bird flying");
		System.out.println(true);
	}

	@Override
	public boolean isAnimal() {
		return true;
	}
}

class Airplane implements Flyer {

	@Override
	public void fly() {
		System.out.println("Airplane flying");
	}

	@Override
	public boolean isAnimal() {
		return false;
	}
}

class FlyerUtil {
	static void show(Flyer flyer) {
		if (flyer instanceof Bird) {
			System.out.println("Bird flying");
			System.out.println("true");
		} else {
			System.out.println("Airplane flying");
			System.out.println("false");
		}
	}
}