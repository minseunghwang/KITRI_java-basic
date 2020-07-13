package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDB {

	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
		String DB_USER = "c##ora_user";
		String DB_PASSWORD = "yeo";
		
		String query = "INSERT INTO STUDENT(STU_NO, STU_NAME)" + "VALUES (2020,'YEO')";

		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(query);

			stmt.executeUpdate(query);
			System.out.println("삽입완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}