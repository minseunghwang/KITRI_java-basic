package problem;

public class Stack implements IStack {

	String[] arr = new String[5];
	int cnt = 0;

	@Override
	public int length() {
		return cnt + 1;
	}

	@Override
	public Object Pop() {
		if (cnt > 0) {
			arr[cnt] = null;
			cnt--;
			System.out.println("pop");
			return true;
		} else {
			return null;
		}
	}

	@Override
	public boolean push(Object ob) {
		if (cnt < arr.length - 1) {
			cnt++;
			arr[cnt] = (String)ob;
			System.out.println("push : " + ob) ;
			return true;
		} else {
			System.out.println("Stack이 꽉 찼습니다.");
			return false;
		}
	}

	@Override
	public Object peek() {
		System.out.println("현재 스택 현황");
		for(int i=0; i<cnt+1; i++) {
			System.out.println(arr[i]);
		}
		return null;
	}

	@Override
	public boolean imEmpty() {
		if (cnt > 0) {
			System.out.println("stack에 데이터가 있따");
			return true;
		} else {
			System.out.println("stack 비었다");
			return false;
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push("a");
		s.push("b");
		s.push("c");
		s.peek();
		s.Pop();
		s.peek();
		s.imEmpty();
		System.out.println("스택 현재 데이터 개수 : " + s.length());
		s.Pop();
		System.out.println("스택 현재 데이터 개수 : " + s.length());
	}
}
