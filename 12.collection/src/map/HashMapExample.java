package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("여동빈",85);
		map.put("홍길동",90);
		map.put("이순신",95);
		map.put("홍길동",100);
		
		System.out.println(map.size());
		
		Set<String> keyset = map.keySet();		// key전체
		Iterator<String> key = keyset.iterator();
		while(key.hasNext()) {
			String tempkey = key.next();
			Integer tempvalue = map.get(tempkey);
			System.out.println(tempkey + " , " + tempvalue);
		}
		
		System.out.println();
		
		map.clear();;
		while(key.hasNext()) {
			String tempkey = key.next();
			Integer tempvalue = map.get(tempkey);
			System.out.println(tempkey + " , " + tempvalue);
		}
	}
}
