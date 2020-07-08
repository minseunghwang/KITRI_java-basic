package threadState;

public class targetThreadExample {

	public static void main(String[] args) {
		StatePrintThread thread = new StatePrintThread(new TargetThread());
		thread.start();
		
		
	}
}
class StatePrintThread extends Thread{
	private TargetThread tt;
	
	public StatePrintThread(TargetThread tt) {
		this.tt = tt;
	}
	
	@Override
	public void run() {
		while (true) {
			Thread.State state = tt.getState();
			System.out.println("타겟 스레드 상태 : " + state);
			
			if(state == Thread.State.NEW) {
				tt.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}


class TargetThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10000000; i++) {
			// Run
		}
		try {
			// wait
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for(int i=0; i<10000000; i++) {
			// run
		}
	}
}