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
		
//		System.out.println(Math.round(33.373 * 10) / 10.0); //소숫점 둘째자리 까지 표시
//		System.out.println(Math.round((float)s.total/3*10));
//		System.out.println((float)s.total/3*10);

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
		float avg = (float) (Math.round((float)total/3*10) / 10.0);
		return avg;
	}


}
