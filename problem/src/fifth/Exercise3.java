package fifth;

public class Exercise3 {
	public static void main(String[] args) {
		Unit unit = new Unit();
		unit.move(1, 1);
		unit.stop();
		
		Marine marine = new Marine();
		marine.move(2, 2);
		marine.stimPack();
		
		Tank tank = new Tank();
		tank.move(3, 3);
		tank.changeMode();
		
		Dropship dropship = new Dropship();
		dropship.stop();
		dropship.load();

	}
}

class Unit {
	int x, y; // 현재 위치
	
	Unit(){
		System.out.println("Unit 생성");
	}
	
	void move(int x, int y) {
		System.out.println(x + "," + y + "위치로 이동!");
	}
	void stop() {
		System.out.println("정지!");
	}
}

class Marine extends Unit{ // 보병
	Marine(){
		System.out.println("보병 생성!");
	}
	void stimPack() {
		System.out.println("보병의 스팀팩");
	}
}

class Tank extends Unit{ // 탱크
	Tank(){
		System.out.println("탱크 생성");
	}
	void changeMode() {
		System.out.println("탱크의 시즈모드");
	}
}

class Dropship extends Unit{ // 수송선
	Dropship(){
		System.out.println("드랍쉽 생성");
	}
	void load() {
		System.out.println("수송선의 탑승");
	}
	void unload() {
		System.out.println("수송선의 드랍");
	}
}