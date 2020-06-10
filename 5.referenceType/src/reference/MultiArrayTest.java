package reference;

public class MultiArrayTest {

	public static void main(String[] args) {
		int[][] multiArr = new int[4][5];
		System.out.println(multiArr[0][0]);

		int[][] gugudan = { { 9, 9, 9 }, { 9, 2, 18 }, { 9, 3, 27 }, { 9, 4, 36 } };

		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan[i].length; j++) {
				System.out.print(gugudan[i][j]);
			}
			System.out.println();
		}
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int temp : arr) {
			System.out.println(temp);
		}

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

		int[][] marr = new int[5][5];
		int count = 1;
		for (int i = 0; i < marr.length; i++) {
			for (int j = 0; j < marr[i].length; j++) {
				marr[i][j] = count++;
			}
		}
		for (int i = 0; i < marr.length; i++) {
			for (int j = 0; j < marr[i].length; j++) {
				System.out.printf("%3d", marr[i][j]);
			}
			System.out.println();
		}

		System.out.println("example2");
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 21 24 25

		int[][] iarr = new int[5][5];
		count = 1;

		for (int i = 0; i < iarr.length; i++) {
//			int j = (i % 2 == 1 ? 4 : 0);
			if (i % 2 == 1) {
				for (int j = 4; j >= 0; j--) {
					iarr[i][j] = count++;
				}
			} else {
				for (int j = 0; j < iarr.length; j++) {
					iarr[i][j] = count++;
				}
			}
		}

		for (int i = 0; i < iarr.length; i++) {
			for (int j = 0; j < iarr[i].length; j++) {
				System.out.printf("%3d", iarr[i][j]);
			}
			System.out.println();
		}
	}

}
