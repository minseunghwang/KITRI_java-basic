package homework_4;

public class Test {
	public static void main(String[] args) {
		int[][] key = {{0,0,0},{1,0,0},{0,1,1}};
		int[][] lock = {{1,1,1},{1,1,0},{1,0,1}};
		System.out.println(solution(key,lock));
	}
	
	public static boolean solution(int[][] key, int[][] lock){
		boolean answer = true;

		// 구현위치
		int start = key.length-1;
		int end = lock.length + start;
		int expendSize = start*2 + lock.length;
		
		for(int a=0; a<4; a++) {
			for(int i=0; i<end; i++) {
				for(int j=0; j<end; j++) {
					if (check(i,j,key,lock,start,end,expendSize)) {
						return true;
					}
				}
			}
			key = rocation(key);
		}
		return false;
	}
	
	public static boolean check(int startX, int startY, int[][] key, int[][] lock, int start, int end, int expendSize) {
		int[][] expendList = new int[expendSize][expendSize];
		
		for(int i=0; i<key.length; i++) {
			for(int j=0; j<key.length; j++) {
				expendList[startX + i][startY + j] = key[i][j];
			}
		}
		
		for(int i=0; i<lock.length; i++) {
			for(int j=0; j<lock.length; j++) {
				expendList[start + i][start + j] += lock[i][j];
				if (expendList[start + i][start + j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int[][] rocation(int arr[][]) {
		int len = arr.length;
		int[][] r_key = new int[len][len];
		// 초기화 해줘야되나 ?...
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				r_key[j][len-1-i] = arr[i][j];
			}
		}
		
		
		return r_key;
	}
}
