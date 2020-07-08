package threadState.stop;

// stop말고 interrupt 쓰기 ?! stop은 전체가 다 멈춰버려서 ? ㅇㅅㅇ;

public class StopExample {

	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		pt.interrupt();
	}

}
