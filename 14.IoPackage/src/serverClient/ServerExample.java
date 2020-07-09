package serverClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.25", 5001)); // 신호를 날리면 받아주고 대답해줄 애? 바인딩 ?

			System.out.println("Waiting");
			Socket socket = serverSocket.accept();
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			
			System.out.println("연결 성공");
			System.out.println("-- client information --");
			System.out.println(isa.getHostName());
			System.out.println(isa.getPort());
			System.out.println(isa.toString());
			System.out.println("-- client information --");
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			String userid = dis.readUTF();
			
			while (true) {
				String usrMsg = dis.readUTF();
				System.out.println(userid + " : " + usrMsg);
				if(usrMsg.equals("EXIT")) {
					break;
				}
				dos.writeUTF(usrMsg);
				dos.flush();
			}
			dos.close();
			os.close();
			dis.close();
			is.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
