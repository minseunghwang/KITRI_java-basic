package fourth;

public class StudentExample {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	
	int getTotal() {
		total = kor + eng + math;
		return total;
	}
	
	float getAverage() {
		float avg = (float)total/3.2f;
		return avg;
	}
}
