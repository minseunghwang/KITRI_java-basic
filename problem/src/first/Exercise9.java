package first;

class Exercise9 {
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = ('A'<=ch && ch<='Z') ? (char)(ch+32)  : ch; 
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		}
}