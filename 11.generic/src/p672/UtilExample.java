package p672;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
//		OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
//		int otherAge = Util.getValue(otherPair, "홍삼원");
//		System.out.println(otherAge);
	}
}

class Pair<K, V>{
	private K key;
	private V value;
	
	Pair(K key, V value){
		this.key = key;
		this.value = value;
	}
}

class Util{
	public static <P extends Pair, K, I> I getValue(P p, K key) {
		I result;
		if(key == p.getKey()) {
			result = (I) p.getValue();
		} else {
			result = null;
		}
		return result;
	}
}
