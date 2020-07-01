package supermarket;

public class market_example {
	public static void main(String[] args) {
		Supclass supclass = new Supclass(30000);
		supclass.buy("banana");
		supclass.buy("banana");
		supclass.buy("fish");
		System.out.println("장바구니에 물건의 전체 개수 : " + supclass.shopping_basket());
		System.out.println("장바구니 물건의 전체 가격 : " + supclass.total_price());
		System.out.println("남은 금액 : " + supclass.left_money());
		
		supclass.buy("tomato");
		supclass.buy("milk");
		supclass.buy("tomato");
		System.out.println("장바구니에 물건의 전체 개수 : " + supclass.shopping_basket());
		System.out.println("장바구니 물건의 전체 가격 : " + supclass.total_price());
		System.out.println("남은 금액 : " + supclass.left_money());
		
	}
}
