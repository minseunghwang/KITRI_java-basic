package list;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// JAVA
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBatis");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		
		list.remove(2);
		System.out.println("==============");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		
		list.remove("JDBC");
		System.out.println("==============");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		
		
	}
}
