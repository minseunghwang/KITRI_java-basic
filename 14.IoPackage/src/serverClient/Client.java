package serverClient;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Socket socket = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket();

			System.out.println("요청");
			socket.connect(new InetSocketAddress("192.168.0.25", 5001));

			System.out.println("연결성공");
			OutputStream os = socket.getOutputStream();
			while (true) {
				
//			String message = "Hi Server 메롱메롱222";
				String message = sc.next();
				byte[] bytes = message.getBytes();
				os.write(bytes);
				os.flush(); // buffer 청소!
				if (message == "q") {
					break;
				}
			}
			InputStream is = socket.getInputStream();
			byte[] buf = new byte[100];
			int readCount = is.read(buf);
			String inputMessage = new String(buf, 0, readCount, "UTF-8");
			System.out.println("데이터 받기 : " + inputMessage);

			os.close();
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
