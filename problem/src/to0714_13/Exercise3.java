package to0714_13;

public class Exercise3 {
	static boolean stopped = false;

	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		th1.start();
		try {
			Thread.sleep(7 * 1000);
		} catch (Exception e) {
		}

		stopped = true;
		// 쓰레드를 정지시킨다.
		System.out.println("stopped");
	}
}

class Thread5 extends Thread {
	public void run() {
// Exercise3.stopped의 값이 false인 동안 반복한다.
		try {
			for (int i = 0; !Exercise3.stopped; i++) {
				System.out.println(i);
				Thread.sleep(3 * 1000);
			}
		} catch (Exception e) {
		}
	} // run()
}
