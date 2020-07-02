package anony;

//익명 객체 ?

public class ClassExample {
	public static void main(String[] args) {
		IA ia = new IA() {			// 한번만 쓰고 버릴 객체를 만들겠다
			public void print() {
				System.out.println("익명객체 사용");
			}
		};
		ia.print();
	}

}
