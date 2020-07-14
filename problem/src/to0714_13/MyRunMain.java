package to0714_13;

public class MyRunMain {
	public static void main(String[] args) {
		MyRun mr1 = new MyRun();
		Thread t1 = new Thread(mr1);
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		for (int i = 0; i < 100; i++) {
			System.out.print("M");
		}
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("쓰레드 작동");
	}
}

class MyRun implements Runnable{
	@Override
	public void run() {
		System.out.println("러너블 작동");
	}
}