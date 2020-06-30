package staticExample;

public class EnumExample {

	public static void main(String[] args) {
		Week week = Week.SUNDAY;
		
		if(week == Week.SUNDAY) {
			System.out.println(week);
		}
	}
}
