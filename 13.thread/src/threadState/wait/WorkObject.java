package threadState.wait;

// 두개의 thread를 데이터가 왔다갔다

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA methodA()");
		notify();
		try {
			wait();
		} catch (Exception e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB methodB()");
		notify();
		try {
			wait();
		} catch (Exception e) {
			
		}
	}
	
	public synchronized void methodC() {
		System.out.println("ThreadC methodC()");
		notify();
		try {
			wait();
		} catch (Exception e) {
			
		}
	}
}
