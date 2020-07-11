package homework_4;

public class Test {
	public static void main(String[] args) {
		int[][] key = {{0,0,0},{1,0,0},{0,1,1}};
		int[][] lock = {{1,1,1},{1,1,0},{1,0,1}};
		System.out.println(solution(key,lock));		// 1
	}
	
	public static boolean solution(int[][] key, int[][] lock){		// 2
		boolean answer = true;

		// 구현위치
		int start = key.length-1;
		int end = lock.length + start;
		int expendSize = start*2 + lock.length;
		
		for(int a=0; a<4; a++) {		//	key를 0도, 90도, 180도, 270도 돌리기 위함
			for(int i=0; i<end; i++) {	
				for(int j=0; j<end; j++) {
					if (check(i,j,key,lock,start,end,expendSize)) {		// 3		// 함수check의 결과가 5-1(false)일 경우 if문 작동 X, 결과가 5-2(True)일 경우 if문 작동 O return true(최종 결과)
						return true;
					}
				}
			}
			key = rocation(key);		// 6		// 90도 회전된 키를 key에 저장
		}
		
		return false;		// 모든 탐색을 했는데도 true가 나오지않음 => False
	}
	
	// 
	public static boolean check(int startX, int startY, int[][] key, int[][] lock, int start, int end, int expendSize) { 		// 4
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
					return false;		// 5-1
				}
			}
		}
		return true;		// 5-2
	}
	
	// key를 90도 회전
	public static int[][] rocation(int arr[][]) {		// 7
		int len = arr.length;
		int[][] r_key = new int[len][len];

		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				r_key[j][len-1-i] = arr[i][j];
			}
		}
		return r_key;		// 90도 회전한 key를 반환
	}
}
