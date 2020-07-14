package to0714_13;

public class Exercise1 {

	public static void main(String[] args) {
		Runnable tr = new TRunnable();
		Thread thread = new Thread(tr);
		thread.start();
		System.out.println("종료");
	}
}

class TRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print('-');
		}
	}
}
