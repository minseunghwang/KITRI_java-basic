package to0709;

public class GoodsStockExample {
	public static void main(String[] args) {
		GoodsStock gs = new GoodsStock("123", 1);
		try {
			gs.subtractStock(5);
		} catch (StockShortageException e) {
			e.printStackTrace();
		}
	}
}
