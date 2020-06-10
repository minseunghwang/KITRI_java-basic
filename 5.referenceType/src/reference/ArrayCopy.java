package reference;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr2 = arr;		//	얕은 복사
		int[] arr3 = new int[3];	// 깊은복사
		int[] arr4 = new int[4];
		int[] arr5 = new int[7];
		
		
		for (int temp:arr) {
			System.out.println(temp);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
		// 깊은복사
		for (int i=0; i<arr.length; i++) {		// 한땀한땀 복사( ->깊은복사)
			arr3[i] = arr[i];
		}
		
		// API를 이용한 깊은복사
		System.out.println("API를 이용한 깊은복사");
		
		System.arraycopy(arr, 0, arr4, 1, 3);
		for (int temp:arr4) {
			System.out.println(temp);
		}
		
		// 복사긔 만들기
		
		System.out.println("내가만든 복사귀");
		int len = myArrayCopy(arr,0,arr5,0,3);
		for (int temp:arr5) {
			System.out.println(temp);
		}
		System.out.println("길이 : " + len);
		
	}
	
	public static int myArrayCopy(int[] src, int srcPos, int[] desc, int descPos, int length) {
		for(int i=0; i<src.length; i++) {
			desc[i+descPos] = src[i+srcPos];
		}
		return length;
	}
}
