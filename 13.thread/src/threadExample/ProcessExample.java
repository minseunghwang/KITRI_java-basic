package threadExample;

public class ProcessExample {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			Process process = run.exec("calc.exe");
			Thread.sleep(10000);		// 10 초
			process.destroy();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
