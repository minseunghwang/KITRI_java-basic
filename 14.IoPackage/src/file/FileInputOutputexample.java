package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputexample {

	public static void main(String[] args) {
		File sourceFile = new File("C:/test/text.txt");
		File resultFile = new File("C:/test/testcopy.txt");
		String str = "Hello World";
		
		// sourceFile에 쓰기
		try {
			FileOutputStream fos = new FileOutputStream(sourceFile);
			fos.write(str.getBytes());
			fos.close();
		} catch (Exception e) {}
		
		try {
			if(!resultFile.exists()) {
				resultFile.createNewFile();
			}
		} catch (Exception e) {}
		
		// sourceFile 읽고, resultFile에 쓰기
		try {
			FileInputStream fis = new FileInputStream(sourceFile);
			FileOutputStream fos = new FileOutputStream(resultFile);
			byte[] buffer = new byte[8];
			int dataCount;
			while((dataCount = fis.read(buffer)) != -1) {
				fos.write(buffer,0,dataCount);
			}
		} catch (Exception e) {}
		
		
	}
}
