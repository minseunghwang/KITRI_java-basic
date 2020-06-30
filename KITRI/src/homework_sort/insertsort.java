package homework_sort;

public class insertsort {
	public static void main(String[] args) {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length) + 1;
		}
		// ���۽ð� ����
		long start = System.currentTimeMillis();

		// **������ġ**//
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

		// ������ �ð� ����
		long end = System.currentTimeMillis();
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if (i % 20 == 19) {
				System.out.println();
			}
		}
		// �ʴ��� ȯ��
		System.out.println("\n���� �ð� : " + (end - start) / 1000.0);
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