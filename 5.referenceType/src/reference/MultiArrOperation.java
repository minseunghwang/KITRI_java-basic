package reference;

public class MultiArrOperation {

	public static void main(String[] args) {
		// 1 2 + 1 2 = 2 4
		// 3 4 3 4 6 8

		// 1 2
		// 3 4

		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		int[][] arr2 = { { 1, 2 }, { 3, 4 } };
		int[][] arr3 = new int[2][2];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr1[i].length; k++) {
					arr3[i][j] += arr1[i][k] * arr2[k][j];
					
					
//0 0 0
//0 0 1
//0 1 0
//0 1 1
//1 0 0
//1 0 1
//1 1 0
//1 1 1
//					//////////
//					arr3[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0];
//					arr3[0][1] = arr1[0][0] * arr2[0][1] + arr1[0][1] * arr2[1][1];
//					arr3[1][0] = arr1[1][0] * arr2[0][0] + arr1[1][1] * arr2[1][1];
//					arr3[1][1] = arr1[1][0] * arr2[0][1] + arr1[1][1] * arr2[1][1];
				}
			}
		}
		for (int[] tarr : arr3) {
			for (int tVar : tarr) {
				System.out.print(tVar + " ");
			}
			System.out.println();
		}

	}
}
