package classExample;

public class Supercarexample {

	public static void main(String[] args) {
		Supercar supercar = new Supercar("yeo");
		
		System.out.println("나의 차 이름은 " + supercar.carname + "이고, " + "최고속도는 " + supercar.maxspeed + "이다");
		
		supercar.powerOn(); // 시동걸어
		supercar.setMode('D'); // 기어 D
		supercar.accel();
		supercar.accel();
		supercar.accel();
		supercar.stop();
		supercar.stop();
		supercar.stop();
	}

}

class Supercar{
	Supercar(String master){
		if (master == "yeo") {
			System.out.println("고니치와;;?");
		}
		System.out.println("수퍼카출격");
	}
	
	String carname = "아수라다";
	int maxspeed = 500;
	int speed = 0;
	boolean power = false;
	char mode = 'N';
	
	// 시동켜기
	void powerOn(){
		System.out.println("시동on");
		this.power = true;
	}
	
	// 시동끄기
	void powerOff() {
		System.out.println("시동off");
		this.power = false;
	}
	
	// 모드
	void setMode(char m) {
		if(power == true) {
			if (speed == 0) {
				this.mode = mode;
			} else if (speed > 0 && (mode == 'D' || mode == 'N')) {
				this.mode = mode;
			} else {
				System.out.println("mode 변경이  되지 않습니다.");
			}
		}
	}
	
	// 엑셀
	void accel() {
		if (power == true) {
			if(mode == 'D' && speed <= maxspeed-30) {
				speed += 30;
			} else if(mode == 'R' && speed == 0) {
				speed -= 10;
			} else if(mode == 'D' && speed >= maxspeed-30) {
				speed = maxspeed;
			}
		}
	}
	
	// 브레이크
	void stop() {
		if (speed > 0) {
			speed -= 50;
			if(speed < 0) {
				speed = 0;
			}
			System.out.println("브레이크 후 현재속도 : " + speed);
		}
		else {
			System.out.println("정지 상태입니다.");
		}
	}
}