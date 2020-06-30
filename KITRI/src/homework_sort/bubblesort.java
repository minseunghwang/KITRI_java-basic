package homework_sort;

public class bubblesort {

	   public static void main(String[] args) {
	      int[] arr = new int[100000];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = (int) (Math.random() * arr.length) + 1;
	      }
	      // 시작시간 저장
	      long start = System.currentTimeMillis();
	      // **구현위치**//
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
	// 37.259
	// 41.155
