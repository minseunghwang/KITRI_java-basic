package iteration;

public class ForForTest {

	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
//			System.out.println(i + "단");
			for (int j = 2; j<11; j++) {
				if (j != i+1)
					System.out.print(j + " * " + i + " = " + i*j + "\t");
				else
					System.out.print("\t\t");
			}
			System.out.println();
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i>=j)
					System.out.print("*");
			}
			System.out.println();
		}

		for (int i=5; i>0; i--) {
			for (int j=0; j<6; j++) {
				if (i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
