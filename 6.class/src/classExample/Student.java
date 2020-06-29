package classExample;

public class Student {
	// 생성자 (입구)
	Student() {
		System.out.println("Student() 생성자");
		System.out.println(age);
		run("yeo");
	}
	
	// 필드
	public int age = 17;
	public String name = "mike";
	
	// 메서드
	void run(String name) {
		System.out.println(name + " 달린다.");
	}
}
