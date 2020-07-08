package threadState.yield;

public class YieldExample {
	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(2);
		} catch (Exception e) {
			
		}
		threadA.work = false;
		try {
			Thread.sleep(2);
		} catch (Exception e) {
			
		}
		threadB.work = false;
		
		System.out.println("프로그램 종료");
	}
}

class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	int cnt = 0;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업중" + cnt);
				cnt += 1;
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}

class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	int cnt = 0;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업중" + cnt);
				cnt += 1;
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}