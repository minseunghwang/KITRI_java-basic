package tryCatchFianlly;

public class tryCatch {
	public static void main(String[] args) {
		
		try {
			// 실행문
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz.toString());
		} catch (Exception e) {
			// 예외처리 발생시 실행문
			System.out.println("예외처리 발생시 실행문");
		} finally {
			System.out.println("항상 실행");
		}
		
	}
}
