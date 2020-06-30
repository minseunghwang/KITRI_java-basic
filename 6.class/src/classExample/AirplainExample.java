package classExample;

public class AirplainExample {
	public static void main(String[] args) {
		F35 f35 = new F35();
		System.out.println(f35.model);
		f35.naming("F35AA");
		System.out.println(f35.model);
	}
}


class F35{
	F35(){		// new F35(); 할때 얘까 초기 model에 덮어쓰여지는군!
		System.out.println("F35() 생성자");
		this.model = "F35a";
	}
	
	String model = "F35A";	// 초기 model 
	
	void naming(String model) {
		this.model = model;
	}
}