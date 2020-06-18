package homework_sort;

public class mergesort {
	static int[] sorted = new int[100000];
	public static void main(String[] args) {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length) + 1;
		}
		// 시작시간 저장
		long start = System.currentTimeMillis();

		// **구현위치**//
		mergeSort(arr,0,arr.length-1);

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
	
	static void merge(int[] arr, int m, int middle, int n) {
		int i = m;
		int j = middle + 1;
		int k = m;
		
		while(i <= middle && j <= n) {
			if(arr[i] <= arr[j]) {
				sorted[k] = arr[i];
				i++;
			} else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		if (i > middle) {
			for(int q=j; q<=n; q++) {
				sorted[k] = arr[q];
				k++;
			}
		} else {
			for(int q=i; q<=middle; q++) {
				sorted[k] = arr[q];
				k++;
			}
		}
		
		for(int t=m; t<=n; t++) {
			arr[t] = sorted[t];
		}
		
	}
	
	
	static void mergeSort(int[] arr, int m, int n) {
		if (m<n) {
			int middle = (m+n)/2;
			mergeSort(arr, m, middle);
			mergeSort(arr, middle+1, n);
			merge(arr,m,middle,n);
		}
	}
	
}