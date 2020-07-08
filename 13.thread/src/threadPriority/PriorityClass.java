package threadPriority;

public class PriorityClass {
	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		int priority = 10;
		for(int i=0; i<10; i++) {
			Thread thread = new CalcThread("Calc - "+i);
			thread.setPriority(priority-i);
			thread.start();
		}
		
	}
}

class CalcThread extends Thread{
	CalcThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<20000000; i++) {
			
		}
		System.out.println(getName());
	}
}
