package threadState.stop;

public class PrintThread extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("PrintThread 동작중");
//				Thread.sleep(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
