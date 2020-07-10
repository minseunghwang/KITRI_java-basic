package to0714_12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		// 교집합
		for(Object i : list1) {
			if(list2.contains(i)) {
				kyo.add(i);
			}
		}
		
		// 차집합
		for(Object i : list1) {
			if(list2.contains(i) == false) {
				cha.add(i);
			}
		}
		
		// 합집합
		Set<Integer> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);
		hap = new ArrayList(set);
		
		
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
		} 
}
