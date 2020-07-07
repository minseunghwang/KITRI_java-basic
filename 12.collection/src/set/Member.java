package set;

public class Member {
	String name;
	int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object ob) {		// set의 특성인 중복객체 제거 부분 이군!
		if(ob instanceof Member) {
			Member member = (Member)ob;
			return member.name.equals(this.name) & (member.age == this.age);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
