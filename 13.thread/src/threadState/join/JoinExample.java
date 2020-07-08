package threadState.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumthread = new SumThread();
		sumthread.start();
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//			
//		}
		
		try {
			sumthread.join();			// 이렇게하면 여기서 멈추네. 멈추고 sumthread다 실행하고 다음거로 넘어가는군
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("1~100합은 : " + sumthread.getSum());
	}
}

class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=1; i++) {
			this.sum += i;
		}
	}
}
