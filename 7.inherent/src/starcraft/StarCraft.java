package starcraft;

public class StarCraft {

	public static void main(String[] args) {
		SCV scv = new SCV();
		Dron dron = new Dron();
		dron.attack(scv);
		System.out.println(dron.hp);
		System.out.println(scv.hp);
	}

}
