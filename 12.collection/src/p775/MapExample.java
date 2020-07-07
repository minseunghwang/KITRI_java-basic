package p775;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keyset = map.keySet();
		Iterator<String> key = keyset.iterator();
		while(key.hasNext()) {
			String temp = key.next();
			if(maxScore < map.get(temp)) {
				maxScore = map.get(temp);
				name = temp;
			}
			totalScore += map.get(temp);
		}
		
		System.out.println("평균점수 : " + totalScore/map.size());
		System.out.println("채고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		
	}
}
