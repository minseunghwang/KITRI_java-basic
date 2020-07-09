package p650_threadDaemon;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}
}

class MovieThread extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("동영상 재생");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("프로그램종료");
		}
	}
}
