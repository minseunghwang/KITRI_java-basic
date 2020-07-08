package threadExample;

public class MainThread {
	public static void main(String[] args) {
		BeepThread bt = new BeepThread();
		bt.start();
		
//		for(int i=0; i<10; i++) {
//			System.out.println("떙" + i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				System.out.println("Thread.sleep() 에러");
//			}
//		}
		
		Runnable br = new BeepRunnable();
		Thread brThread = new Thread(br);
		brThread.start();
		
		System.out.println("Main Thread 종료");
		
	}
}

class BeepRunnable implements Runnable{
	@Override
	public void run() {
		// 실행문
		for(int i=0; i<10; i++) {
			System.out.println("Runnable()-");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread.sleep() 에러");
			}
		}
	}
}

class BeepThread extends Thread{
	@Override
	public void run() {
		// 실행문
		for(int i=0; i<10; i++) {
			System.out.println("떙떙떙" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread.sleep() 에러");
			}
		}
	}
}