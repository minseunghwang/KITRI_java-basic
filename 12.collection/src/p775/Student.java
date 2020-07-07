package p775;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob instanceof Student) {
			Student student = (Student)ob;
			return student.studentNum == this.studentNum;
		}
		return false;
	}
	
	@Override
	public int hashCode() {		// 학번이 같으면 안들어가게(중복제거 할때 학번만 본다느거)
		return studentNum;
	}
}
