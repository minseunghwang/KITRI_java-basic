package threadExample;

public class ThreadName {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA("ta");
		ta.start();
//		ta.setName("ta");
		System.out.println(ta.getName());
		
		Thread tb =new ThreadA("tb");
		tb.start();
//		tb.setName("tb");
		System.out.println(tb.getName());
	}
}

class ThreadA extends Thread{
	ThreadA(String name){
		super(name);
	}
	
	
	@Override
	public void run() {
		System.out.println("ThreadA 실행");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
