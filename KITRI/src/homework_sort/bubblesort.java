package homework_sort;

public class bubblesort {

	   public static void main(String[] args) {
	      int[] arr = new int[100000];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = (int) (Math.random() * arr.length) + 1;
	      }
	      // ���۽ð� ����
	      long start = System.currentTimeMillis();
	      // **������ġ**//
	      int temp = 0;
	      for (int i=arr.length-1; i>0;i--) {
	         for(int j=0; j<i;j++) {
	            if(arr[j] > arr[j+1]) {
	               temp = arr[j+1];
	               arr[j+1] = arr[j];
	               arr[j] = temp;
	            }
	         }
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
	// 37.259
	// 41.155
