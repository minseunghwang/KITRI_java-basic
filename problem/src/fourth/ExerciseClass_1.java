package fourth;

public class ExerciseClass_1 {

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}
	
	static int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -999999;
		}
		else {
			int m_value = -99999;
			int cnt = arr.length-1;
			while (cnt>=0) {
				if (arr[cnt] > m_value) {
					m_value = arr[cnt];
				}
				cnt -= 1;
			}
			return m_value;
		}
	}
	
	static int abs(int value) {
		if (value>=0) {
			return value;
		}
		else {
			return -value;
		}
	}
}

