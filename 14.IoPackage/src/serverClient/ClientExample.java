package serverClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {

	static Socket socket;
	static InputStream is;
	static DataInputStream dis;

	static OutputStream os;
	static DataOutputStream dos;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket();
			System.out.println("요청");
			socket.connect(new InetSocketAddress("192.168.0.25", 5001));
			System.out.println("연결성공");

			is = socket.getInputStream();
			dis = new DataInputStream(is);

			os = socket.getOutputStream();
			dos = new DataOutputStream(os);

			System.out.print("사용자 ID를 입력하세요 : ");
			String id = sc.nextLine();
			dos.writeUTF(id);
			
			Runnable Rrunnable = () ->{
				try {
					while(true) {
						String result = dis.readUTF();
						System.out.println(result);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			};
			
			Runnable Srunnable = () ->{
				try {
					while (true) {
						String msg = sc.nextLine();
						dos.writeUTF(msg);
						os.flush(); // buffer 청소!

						if (msg.equals("EXIT")) {
							System.out.println("대화방 나감");
							break;
						}
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				} 
			};
			
			Thread Sthread = new Thread(Srunnable);
			Thread Rthread = new Thread(Rrunnable);
			Sthread.start();
			Rthread.start();
			
		} catch (Exception e) {

		} finally {
			try {
//				dos.close();
//				os.close();
//				dis.close();
//				is.close();
//				socket.close();
			} catch (Exception e2) {
			}
		}
	}
}
