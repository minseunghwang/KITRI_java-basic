package homework_sort;

public class insertsort {
	public static void main(String[] args) {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length) + 1;
		}
		// 시작시간 저장
		long start = System.currentTimeMillis();

		// **구현위치**//
		int key = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (key < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = key;
		}

		// 끝나는 시간 저장
		long end = System.currentTimeMillis();
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if (i % 20 == 19) {
				System.out.println();
			}
		}
		// 초단위 환산
		System.out.println("\n실행 시간 : " + (end - start) / 1000.0);
	}
}
// 5.208
// 5.018
// 5.414
// 5.493
// 5.277
// 5.171
// 5.125
// 5.076

//2.005
//2.062
//1.87
//2.029
//