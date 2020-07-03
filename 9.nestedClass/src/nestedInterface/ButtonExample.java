package nestedInterface;

import nestedInterface.Button.OnClickListener;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
//		Button.OnClickListener btn2 = new Button.OnClickListener() {
//			@Override
//			public void onClick() {
//				System.out.println("전화 걸어요~");
//			}
//		};
//		btn2.onClick();
		
	}
}

class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("전화 걸어요~");
	}
}

class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("문자 보내요~");
	}
}