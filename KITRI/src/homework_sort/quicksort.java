package homework_sort;

public class quicksort {
	public static void main(String[] args) {
		int[] arr = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length) + 1;
		}
		// 시작시간 저장
		long start = System.currentTimeMillis();

		// **구현위치**//
		quick_sort(arr, 0, arr.length-1);

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

	static void quick_sort(int arr[], int left, int right) {
		if (left < right) {
			int p_idx = partition(arr, left, right);

			quick_sort(arr, left, p_idx - 1);
			quick_sort(arr, p_idx + 1, right);
		}
	}

	static int partition(int arr[], int left, int right) {
		int mid = (left + right) / 2;
		swap(arr, left, mid);
		
		int pivot = arr[left];
		int i = left, j = right;
		
		while (i < j) {
			while (pivot < arr[j]) {
				j--;
			}
			
			while(i < j && pivot >= arr[i]) {
				i++;
			}
			swap(arr, i, j);
		}
		arr[left]  = arr[i];
		arr[i] = pivot;
		return i;
	}

	static void swap(int[] array, int a, int b) {
		int temp = array[b];
		array[b] = array[a];
		array[a] = temp;
	}
}