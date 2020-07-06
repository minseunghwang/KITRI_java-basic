package to0708;

import java.awt.Frame;
import java.awt.event.*;


public class Exercise5 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(200,200);
		
		System.out.println("ㅇㅅㅇ2");
		f.addWindowListener(new EventHandler() {
			public void windowClosing(WindowEvent e) {
				System.out.println("ㅇㅅㅇ");
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}

class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}