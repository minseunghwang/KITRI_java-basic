package serverClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Share {

	List<EchoRunnable> list;
	String shareString = "";


	public Share() {
	}

	public void setList(List<EchoRunnable> list) {
		this.list = list;
	}

	public void setShareString(String line) {
		this.shareString = line;
	}

	public void sendMessage(String id) {
		list.forEach(t ->{
			try {
				t.dos.writeUTF(id + " : " + shareString);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}

class EchoRunnable implements Runnable {
	// 가지고 있어야 하는 field
	Socket socket; // 클라이언트와 연결된 소켓

	public DataInputStream dis;
	public DataOutputStream dos;

	Share share;
	String id;

	public EchoRunnable(Socket socket, Share share, String id) {
		super();
		this.socket = socket;
		this.share = share;
		this.id = id;
		try {
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String line = "";
		try {
			while ((line = dis.readUTF()) != null) {
				share.setShareString(line);
				if (line.equals("EXIT")) {
					System.out.println(id + " 님이 대화방을 나가셨습니다.");
					break;
				} else {
					share.sendMessage(id);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class ServerExample {

	static String userid;
	static ExecutorService executorservice = Executors.newCachedThreadPool();
	static ServerSocket serverSocket;
	static Socket socket;

	static List<EchoRunnable> list = new ArrayList<EchoRunnable>();

	static Share share = new Share();

	public static void main(String[] args) {
		Runnable runnable = () -> {
			try {
				serverSocket = new ServerSocket();
				serverSocket.bind(new InetSocketAddress("192.168.0.25", 5001)); // 신호를 날리면 받아주고 대답해줄 애? 바인딩 ?

				while (true) {
					System.out.println("Waiting");
					socket = serverSocket.accept();
					InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();

					System.out.println("연결 성공");

					InputStream is = socket.getInputStream();
					DataInputStream dis = new DataInputStream(is);

					OutputStream os = socket.getOutputStream();
					DataOutputStream dos = new DataOutputStream(os);
					userid = dis.readUTF();

					System.out.println(userid + " 님이 대화방에 참여하였습니다.");

					EchoRunnable r = new EchoRunnable(socket, share, userid);
					list.add(r);
					System.out.println(list.size() + "명 있다.");
					share.setList(list);
					executorservice.execute(r);

//					while (true) {
//						String usrMsg = dis.readUTF();
//						System.out.println(userid + " : " + usrMsg);
//						if (usrMsg.equals("EXIT")) {
//							System.out.println(userid + " 님이 대화방을 나가셨습니다.");
//							break;
//						}
//						dos.writeUTF(usrMsg);
//						dos.flush();
//					}
				}

//				dos.close();
//				os.close();
//				dis.close();
//				is.close();
//				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
//			finally {
//				try {
//					serverSocket.close();
//				} 
//				catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
		};
		executorservice.execute(runnable);
	}
}
