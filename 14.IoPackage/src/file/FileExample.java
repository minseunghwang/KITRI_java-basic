package file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) {

		try {
			File dir = new File("C:/test/temp");
			File file = new File("c:/test/test.txt");
			File file2 = new File(new URI("file:///c:/test/test2.txt"));

			if (dir.exists() == false) {
				dir.mkdir();
			}

			if (file.exists() == false) {
				file.createNewFile();
			}

			if (file2.exists() == false) {
				file2.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File path= new File("C:/test");
		File[] contents = path.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd		a		HH:mm");
		
		for(File tempfile : contents) {
			System.out.println(sdf.format(new Date(tempfile.lastModified())));
			if (tempfile.isDirectory()) {
				System.out.print("\t<DIR>\t" + tempfile.getName());
			} else {
				System.out.println("\t" + tempfile.length() + "\t" + tempfile.getName());
			}
			System.out.println();
		}
	}
}
