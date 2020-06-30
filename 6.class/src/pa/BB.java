package pa;

public class BB {
	void methodBB() {
		AA aa = new AA();
//		aa.methodAA();		// 야는 private라 안댐
		aa.doMethodAA();	// 야는 default라 댐
		
		aa.aa = 20;
		aa.setter(20);
		
	}
}
