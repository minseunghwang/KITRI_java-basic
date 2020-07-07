package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Spring");
		
		int size = set.size();
		System.out.println(size);
		
		set.add("JDBC");
		
		size = set.size();
		System.out.println(size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.clear();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		if(set.isEmpty()) {
			System.out.println("비어");
		}
		
	}	
}
