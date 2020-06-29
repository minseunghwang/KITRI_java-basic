package fourth;

class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i + 1;
			String a = String.valueOf(num);
			boolean isKwang = false;
			for (int j = 0; j < a.length(); j++) {
				char c = a.charAt(j);
				if (c == '3' || c == '6' || c == '9') {
					isKwang = true;
				}
			}
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class ClassAa {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}
}
