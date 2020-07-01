package supermarket;

public class Supclass {
	private int banana_price = 1000;
	private int tomato_price = 2000;
	private int milk_price = 1500;
	private int fish_price = 4000;
	
	int banana_cnt;
	int tomato_cnt;
	int milk_cnt;
	int fish_cnt;
	
	int money;
	
	public Supclass(int money) {
		this.money = money;
	}
	
	void buy(String item) {
		if(item == "banana") {
			banana_cnt++;
		} else if(item == "tomato") {
			tomato_cnt++;
		} else if(item == "milk") {
			milk_cnt++;
		} else if(item == "fish") {
			fish_cnt++;
		}
	}
	
	// 장바구니 물건의 개수
	int shopping_basket() {
		return banana_cnt + tomato_cnt + milk_cnt + fish_cnt;
	}
	
	// 장바구니에 있는 물건의 전체 가격
	int total_price() {
		return banana_cnt*banana_price + tomato_cnt*tomato_price + milk_cnt*milk_price + fish_cnt*fish_price;
	}
	
	// 고객이 가지고 있는 남은 금액
	int left_money() {
		money -= total_price();
		return money;
	}
	
}
