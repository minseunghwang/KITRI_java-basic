package to0714_13;

import javax.swing.JOptionPane;

public class Exercise4 {

	public static void main(String[] args) {
		Exercise th1 = new Exercise();
		th1.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt(); // 쓰레드에게 작업을 멈추라고 요청한다.
	}
}

class Exercise extends Thread {
	public void run() {
		int i = 10;
		try {
			while (i != 0 && !isInterrupted()) {
				System.out.println(i--);
				Thread.sleep(1000); // 1초 지연
			}
		} catch (InterruptedException e) {
		}
		System.out.println("카운트가 종료되었습니다.");
	} // main
}
