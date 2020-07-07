package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		
		System.out.println(set.size());
		
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member tempMember = it.next();
			System.out.print(tempMember.name + ", ");
			System.out.println(tempMember.age);
		}
	}
}
