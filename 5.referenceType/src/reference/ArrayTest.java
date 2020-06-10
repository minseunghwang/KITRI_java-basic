package reference;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int arr2[] = new int[7];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		
		System.out.println(arr[0]);
		for (int i=0; i<7; i++) {
			System.out.println(arr[i]);
		}
		
		double[] arrDou = null;
		long[] arrLong = {1,2,3};
		byte[] arrByte = null;
		
		arrByte = new byte[10];
		
		for (int i=0; i<10; i++) {
			arrByte[i] = (byte)i;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(arrByte[i]);
		}
		
		
		System.out.println("LOTTO");
		// lotto 7자리 1~45
		int lotto[] = new int[7];
		for (int i=0; i<7; i++) {
			Random r = new Random();
			lotto[i] = (int)(Math.random()*45)+1;
			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		
		int[] number = new int[45];
		for(int i=0; i<45; i++) {
			number[i] = i+1;
		}
		
		int[] arrlotto2 = new int[7];
		for(int i=0; i<7; i++) {
			int numi = (int)(Math.random()*44) + 1;
			if(number[numi] != 0) {
				arrlotto2[i] = number[numi];
				number[numi] = 0;
			} else {
				i--;
			}
		}
		
		for(int i=0; i<7; i++) {
			System.out.print(arrlotto2[i]+" ");
		}
		
		
		// 가장큰 값
		System.out.println();
		System.out.println("맨앞에가장큰값");
		int maxarr[] = new int[5];
		for(int i=0; i<maxarr.length; i++) {
			maxarr[i] = (int)(Math.random()*10)+1;
		}
		int maxval = 0;
		int maxindex = 0;
		int temp = 0;
		for (int i=0; i<maxarr.length; i++) {
			if (maxval < maxarr[i]) {
				maxval = maxarr[i];
				maxindex = i;
			}
		}
		temp = maxarr[0];
		maxarr[0] = maxarr[maxindex];
		maxarr[maxindex] = temp;
		
		for(int i=0; i<maxarr.length; i++) {
			System.out.print(maxarr[i]+" ");
		}
		
		
		// select sorting
		System.out.println();
		System.out.println("select sorting");
		
		int maxarr2[] = new int[5];
		
		for(int i=0; i<maxarr2.length; i++) {
			maxarr2[i] = (int)(Math.random()*10)+1;
		}
		
		for (int i=0; i<maxarr2.length;i++) {
			int maxval2 = 0;
			int maxindex2 = 0;
			for (int j=i; j<maxarr2.length;j++) {
				if (maxval2 < maxarr2[j]) {
					maxval2 = maxarr2[j];
					maxindex2 = j;
				}
			}
			temp = maxarr2[i];
			maxarr2[i] = maxarr2[maxindex2];
			maxarr2[maxindex2] = temp;
		}
		for(int i=0; i<maxarr2.length; i++) {
			System.out.print(maxarr2[i]+" ");
			System.out.println();
		}
		
		// bubble sorting
		System.out.println("bubble sort");
		int maxarr3[] = new int[5];

		for(int i=0; i<maxarr3.length; i++) {
			maxarr3[i] = (int)(Math.random()*10)+1;
		}
		temp = 0;
		for (int i=0; i<maxarr3.length; i++) {
			System.out.printf("%d 단계 : ", i+1);
			for(int q=0; q<maxarr3.length; q++) {
				System.out.print(maxarr3[q]+" ");
			}
			System.out.println();
			for(int j=1; j<maxarr3.length; j++) {
				if (maxarr3[j-1] < maxarr3[j]) {
					swap(maxarr3,j);
				}
			}
		}
		
	}
	public static void swap(int[] arrarr, int jj) {
		int temp = 0;
		temp = arrarr[jj-1];
		arrarr[jj-1] = arrarr[jj];
		arrarr[jj] = temp;		
	}
	
}
