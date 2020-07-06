package wildcardType;

public class WildCard {
	
//	Course<Person>[] course1= new Course<T> [5];
	Course<Person>[] course2= (Course<Person>[])(new Object[5]);
	
	public static void job(Course<HighStudent> course) {}
	public static void job2(Course<?> course2) {}
	public static void job3(Course<? extends Student> course) {}
	public static void job4(Course<? super Worker> course) {}
	
	public static void main(String[] args) {
		Course<HighStudent> c1 = new Course<>();
		Course<Student> c2 = new Course<>();
		Course<Worker> c3 = new Course<>();
		Course<Person> c4 = new Course<>();
		
		job(c1);
//		job(c2);
		
		job2(c1);
		job2(c2);
		
		job3(c1);
		job3(c2);
		
		job4(c3);
		job4(c4);
		
	}
}

class Course<T extends Person> {}

class Person {}
class Worker extends Person {}
class Student extends Person {}
class HighStudent extends Student{}