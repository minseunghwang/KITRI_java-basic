package terms;

public class CallBy {

	public static void main(String[] args) {
		Call call = new Call(20);
		callValue(10);
		callRef(call);
	}
	
	//CallbyValue 값에의한참조
	static void callValue(int a) {
		System.out.println(a);
	}
	
	//CallbyReference 주소에의한참조
	static void callRef(Call call) {
		System.out.println(call.a);
	}
}

class Call{
	int a;
	Call(int a){
		this.a = a;
	}
}
