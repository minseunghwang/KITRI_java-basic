package to0709;

import java.util.Objects;

public class test {

	public static void main(String[] args) {
//		Integer obj = Integer.valueOf(1000);
//		Integer obj2 = Integer.valueOf("1000");
//		
//		System.out.println(obj);
//		System.out.println(obj.getClass());
//		System.out.println(obj2.getClass());
//		
//		int num = obj.intValue();
//		System.out.println(num);
		
//		Integer obj1 = 300;
//		Integer obj2 = 300;
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
//		
//		obj1 = 100;
//		obj2 = 100;
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
//		
//		Integer aa = null;
//		int aaa;
//		
//		System.out.println(aa);
//		
//		int v = (int)(Math.random()*10);
//		System.out.println(v);
//		
//		int  a = Math.max(1,2);
//		
		double aa = -5.8945;
		
		System.out.println(Math.ceil(aa*100)/100);
		System.out.println(Math.ceil(aa));
		
		int a = 311;
		int b = 222;
		double v1 = Math.pow(a,b);
		System.out.println(v1);
		double v2 = Math.sqrt(16);
		System.out.println(v2);
		
		double b1= Math.tan(45*Math.PI/180);
		System.out.println(b1);
		
		int v3 = Math.subtractExact(10,3);
		System.out.println("ㅂㄴㅅ " + v3);
		
		long v7 = Math.round(5.3);
		System.out.println(v7);
		
		Short obj = new Short((short) 100);
//		Integer obj = new Integer(100);
		System.out.println(obj);
		
		String ms = "홍길동&이수종,박연수, 김자바-최명호, ()낙지사";
		String[] mss = ms.split("-");
		System.out.println(mss[0]);
		System.out.println(mss[1]);
		
		StringBuilder sb = new StringBuilder();
		sb.append("abcd");
		System.out.println(sb);
		sb.append("efgh");
		System.out.println(sb);
		sb.delete(4, 7);
		System.out.println(sb);
		System.out.println(sb.length());
	}

}

