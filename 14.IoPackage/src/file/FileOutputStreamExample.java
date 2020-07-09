package file;

import java.io.FileOutputStream;

// 쓰기
public class FileOutputStreamExample {
	public static void main(String[] args) {
		String filePath = "C:/test/test2.txt";
		String text = "Hi Hello";
		byte[] textByte = text.getBytes();
		
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			fos.write(textByte,0,textByte.length);
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
