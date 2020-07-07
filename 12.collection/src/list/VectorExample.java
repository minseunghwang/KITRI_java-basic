package list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add(1,"Database");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		list.remove(2);
		
		for(String str : list) {
			System.out.println(str);
		}
	}

}
