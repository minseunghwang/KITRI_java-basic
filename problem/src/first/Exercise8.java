package first;

class Exercise8 {
	public static void main(String[] args) {
		char ch = '9';
		boolean b = (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9') ? true:false);
		System.out.println(b);
		} 
} 