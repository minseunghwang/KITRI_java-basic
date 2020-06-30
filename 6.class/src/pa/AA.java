package pa;

// 외부에서 이 private한 methodAA를 쓰고싶을때가 있다. 그럴때 getter, setter 사용
public class AA {
	private int aa = 10;
	
	int getter() {		// 읽기
		return aa;
	}
	
	void setter(int aa) {		// 쓰기
		this.aa = aa;
	}
	
	
	private void methodAA() {
		
	}
	
	void doMethodAA() {
		methodAA();
	}
	
}
