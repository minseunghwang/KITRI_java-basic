package starcraft;

public class Worker {
	int hp;
	int mp;
	int attackLevel;
	int depenceLevel;
	int x, y;

	int mine(int x, int y) {
		this.x = x;
		this.y = y;
		return 0;
	}
	
	boolean attack(Dron dron) {
		boolean result = false;
		dron.hp -= attackLevel;
		return result;
	}
	boolean attack(SCV scv) {
		boolean result = false;
		scv.hp -= attackLevel;
		return result;
	}
	boolean attack(Probe probe) {
		boolean result = false;
		probe.hp -= attackLevel;
		return result;
	}
	
}

class Dron extends Worker {
	
	Dron() {
		super.hp = 40;			// Worker에서 선언한 hp를 가져와서 쓴겨
		super.attackLevel = 5;
		System.out.println("드론!");
	}
	
	@Override
	int mine(int x , int y) {
		System.out.println("x : " + x + ", y :" + y);
		return 0;
	}
}

class SCV extends Worker {
	
	SCV() {
		super.hp = 50;
		super.attackLevel = 5;
		System.out.println("에쒸비!");
	}

	@Override
	int mine(int x , int y) {
		System.out.println("x : " + x + ", y :" + y);
		return 0;
	}
	

	
}

class Probe extends Worker {
	
	Probe() {
		super.hp = 40;
		super.attackLevel = 5;
		System.out.println("프로브!");
	}

	@Override
	int mine(int x , int y) {
		System.out.println("x : " + x + ", y :" + y);
		return 0;
	}
	

}
