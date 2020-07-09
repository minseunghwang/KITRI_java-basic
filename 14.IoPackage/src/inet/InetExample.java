package inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			
			InetAddress[] isArr = InetAddress.getAllByName("www.naver.com");		// 네이버는 워낙 서버가 커서 ip를 2개이상 사용하기때문에 배열로 받아줌
			for(InetAddress inet : isArr) {
				System.out.println(inet.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
