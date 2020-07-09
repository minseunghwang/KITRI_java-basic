package serverClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.25", 5001)); 		// 신호를 날리면 받아주고 대답해줄 애? 바인딩 ?
			
			while(true) {
				System.out.println("Waiting");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
				
				System.out.println("-- client information --");
				System.out.println(isa.getHostName());
				System.out.println(isa.getPort());
				System.out.println(isa.toString());
				System.out.println("-- client information --");
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				byte[] bytes = new byte[100];
				int readCount = is.read(bytes);
				String message = new String(bytes, 0, readCount, "UTF-8");
				System.out.println("데이터 받기(from Client) : " + message);
				
				String inputString = "hello Client";
				byte[] buf = inputString.getBytes();
				os.write(buf);
				os.flush();
				System.out.println("Server data 전송!");
				os.close();
				is.close();
				socket.close();
			}

			
			
						
		} catch (Exception e) {
			
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
