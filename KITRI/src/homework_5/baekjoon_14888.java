package homework_5;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_14888 {
	
	public static int[] arr;
	public static int[] op;
	public static int min_ = Integer.MAX_VALUE;
	public static int max_ = Integer.MIN_VALUE;
	public static ArrayList<Integer> list;
	public static int idx = 1;
	public static int k;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		op = new int[4];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			op[i] = sc.nextInt();
		}
		
		calc(arr[0], op[0], op[1], op[2], op[3], idx);
		
		System.out.println(max_);
		System.out.println(min_);
	}
	
	public static int calc(int m, int a, int b, int c, int d, int idx) {
		if(idx == arr.length) {
			max_ = Math.max(max_, m);
			min_ = Math.min(min_, m);
		}
		
		if(a>0) {
			k = m + arr[idx];
			calc(k, a-1, b, c, d, idx+1);
		}
		if(b>0) {
			k = m - arr[idx];
			calc(k, a, b-1, c, d, idx+1);
		}
		if(c>0) {
			k = m * arr[idx];
			calc(k, a, b, c-1, d, idx+1);
		}
		if(d>0) {
			k = m / arr[idx];
			calc(k, a, b, c, d-1, idx+1);
		}
		
		return m;
	}

}
