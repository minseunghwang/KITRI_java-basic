package p672;

public class ContainerExample2 {

	public static void main(String[] args) {
		Container2<String, String> container2 = new Container2<String, String>();
		container2.set("홍길동", "도적");
		String name1 = container2.getKey();
		String job = container2.getValue();
		System.out.println(name1 +  job);
		
		Container2<String, Integer> container3 = new Container2<String, Integer>();
		container3.set("홍길동",35);
		String name2 = container3.getKey();
		int age = container3.getValue();
		System.out.println(name2 + age);
	}
}

class Container2<T, J>{
	private T key;
	private J job;
	
	void set(T key, J job) {
		this.key = key;
		this.job = job;
	}
	
	T getKey() {
		return key;
	}
	
	J getValue() {
		return job;
	}
}