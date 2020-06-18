package homework_sort;

public class selectsort {
	public static void main(String[] args) {
		long sum = 0;
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length) + 1;
		}

		// 시작시간 저장
		long start = System.currentTimeMillis();

		// **구현위치**//
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int min = 100000;
			int mindex = 0;

			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					mindex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[mindex];
			arr[mindex] = temp;
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
// 3.754
// 2.368
// 2.405
// 2.467
// 5.122
// = 3.2232

// = 2.2
// = 2.4
