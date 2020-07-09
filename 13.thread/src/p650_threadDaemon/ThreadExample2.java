package p650_threadDaemon;

public class ThreadExample2 {

	public static void main(String[] args) {
			Thread thread = new MovieThread2();
			thread.setDaemon(true);		// main thread가 종료될때, 따라온 thread들도 종료됌
			thread.start();
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("프로그램 종료22");
	}
}

class MovieThread2 extends Thread {
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