package reference;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "yeo";
		String str2 = new String("yeo");	// string타입으로 str2 라는걸 스텍에 할당한다음(아직 주소값할당 ㄴ), 힙에다가 메모리 할당한 다음에 그 주소값을 str2에 할당
		String str3 = "yeo";
		String str4 = new String("yeo");
		
		if (str1 == str3)	// stack 주소 비교
			System.out.println("str1,str3의 stack주소가 같다.");
		else
			System.out.println("str1,str3의 stack주소가 다르다.");
		
		if (str1 == str2)	// stack 주소 비교
			System.out.println("str1,str2의 stack주소가 같다.");
		else
			System.out.println("str1,str2의 stack주소가 다르다.");
		
		if (str2 == str4)	// stack 주소 비교
			System.out.println("str2,str4의 stack 주소가 같다.");
		else
			System.out.println("다르다.");
		
		if (str2.equals(str4))	// 값 비교
			System.out.println("값이 같다");
		
		
	}
}
