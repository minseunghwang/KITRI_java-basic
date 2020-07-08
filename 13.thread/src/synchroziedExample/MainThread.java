package synchroziedExample;

public class MainThread {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		User1 user1 = new User1();		// Thread User1
		user1.setCalc(cal);
		user1.start();
				
		User2 user2 = new User2();		// Thread User2
		user2.setCalc(cal);
		user2.start();
	}

}

class User1 extends Thread{
	private Calculator cal;
	
	User1(){
		this.setName("User1");
	}
	
	public void setCalc(Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(1);
	}
}

class User2 extends Thread{
	private Calculator cal;
	
	User2(){
		this.setName("User2");
	}
	
	public void setCalc(Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(2);
	}
}


class Calculator{
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {		// ② 그래서 여기 synchronized 넣어줌 -> 정상?적으로 나옴
		this.memory = memory;
		try {
			Thread.sleep(2000);			// ① User1이 먼저 돔, setMemory(1)에 의해 1이 저장됨, 2초를 기다리는동안 User2이 돌면서 setMemory(2)에 의해 2가 저장, 둘다 2가 나옴...
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
