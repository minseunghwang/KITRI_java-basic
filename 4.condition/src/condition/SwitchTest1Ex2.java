package condition;

public class SwitchTest1Ex2 {

	public static void main(String[] args) {
		int student = 94;
		String score = "";
		
		switch (student/10) {
		case 10:
		case 9: score = "A"; break;
		case 8: score = "B"; break;
		case 7: score = "C"; break;
		case 6: score = "D"; break;
		default : score = "F";
		}
		
		if(((student % 10 >= 5) && (student>=60)) || (student == 100)) {
			score = score + "+";
		}
		System.out.println(score);

	}

}
