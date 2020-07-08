package p648;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Runnable mr = new MusicRunnable();
		Thread thread2 = new Thread(mr);
		thread2.start();
	}
}

class MovieThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("동영상재생");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("avi error");
			}
		}
	}
}

class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("음악 재생");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("music error");
			}
		}
	}
}
