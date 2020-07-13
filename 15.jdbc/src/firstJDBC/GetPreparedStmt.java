package firstJDBC;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetPreparedStmt {

	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String DB_USER = "c##ora_user";
		String DB_PASSWORD = "yeo";

		String query = "SELECT * FROM STUDENT";

		String filePath = "C:/test/";
		String fileName = "Student.txt";
		File dir = new File(filePath);
		
		if (dir.exists() == false) {
			dir.mkdir();
		}

		File file = new File(filePath + "/" + fileName);

		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			FileOutputStream fos = new FileOutputStream(file);
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String stu_no = rs.getString(1);
				String stu_name = rs.getString(2);
				String text = stu_no + " " + stu_name + "\r\n";
				System.out.print(text);

				byte[] bytes = text.getBytes();

				fos.write(bytes);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
