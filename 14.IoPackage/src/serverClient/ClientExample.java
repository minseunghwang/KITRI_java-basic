package serverClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {

	public static void main(String[] args) {

		Socket socket = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket();
			System.out.println("요청");
			socket.connect(new InetSocketAddress("192.168.0.25", 5001));
			System.out.println("연결성공");
			
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			System.out.println("사용자 ID를 입력하세요 : ");
			String id = sc.nextLine();
			dos.writeUTF(id);
			
			while (true) {
				System.out.println("전송할 메세지 입력 : ");
				String msg = sc.nextLine();
				dos.writeUTF(msg);
				os.flush(); // buffer 청소!
				
				String readMsg = dis.readUTF(); // 내가 보낸 메시지 출력
				System.out.println("받은 메세지 : " + readMsg);
				
				if(msg.equals("EXIT")) {
					break;
				}
			}
			dos.close();
			os.close();
			dis.close();
			is.close();
		} catch (Exception e) {

		} finally {
			try {
				socket.close();
			} catch (Exception e2) {
			}
		}
	}
}
