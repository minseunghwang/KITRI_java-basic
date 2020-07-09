package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWriteCopy {

	public static void main(String[] args) {
		File sourceFile = new File("C:/test/text.txt");
		File resultFile = new File("C:/test/testcopy.txt");
		
		try {
			FileReader fr = new FileReader(sourceFile);
			FileWriter fw = new FileWriter(resultFile);
			
			int data;
			while((data = fr.read()) != -1) {
				fw.write(data);
			}
			
		} catch (Exception e) {
		}
	}

}
