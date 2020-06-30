package singleton;

public class SingletonExample {
// 하나의 객체만 만들고 싶을때 쓴다 !?!
	public static void main(String[] args) {
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s3);
		
		Example e2 = new Example();
		Example e3 = new Example();
		System.out.println(e2);
		System.out.println(e3);
	}
}


class Example {}

