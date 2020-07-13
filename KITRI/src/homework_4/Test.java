package homework_4;

public class Test {
	public static void main(String[] args) {
		int[][] key = {{0,0,0},{1,0,0},{0,1,1}};
		int[][] lock = {{1,1,1},{1,1,0},{1,0,1}};
		System.out.println(solution(key,lock));		// 1
	}
	
	public static boolean solution(int[][] key, int[][] lock){		// 2
		boolean answer = true;

		// ������ġ
		int start = key.length-1;
		int end = lock.length + start;
		int expendSize = start*2 + lock.length;
		
		for(int a=0; a<4; a++) {		//	key�� 0��, 90��, 180��, 270�� ������ ����
			for(int i=0; i<end; i++) {	
				for(int j=0; j<end; j++) {
					if (check(i,j,key,lock,start,end,expendSize)) {		// 3		// �Լ�check�� ����� 5-1(false)�� ��� if�� �۵� X, ����� 5-2(True)�� ��� if�� �۵� O return true(���� ���)
						return true;
					}
				}
			}
			key = rocation(key);		// 6		// 90�� ȸ���� Ű�� key�� ����
		}
		
		return false;		// ��� Ž���� �ߴµ��� true�� ���������� => False
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
	
	// key�� 90�� ȸ��
	public static int[][] rocation(int arr[][]) {		// 7
		int len = arr.length;
		int[][] r_key = new int[len][len];

		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				r_key[j][len-1-i] = arr[i][j];
			}
		}
		return r_key;		// 90�� ȸ���� key�� ��ȯ
	}
}
