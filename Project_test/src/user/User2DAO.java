package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User2DAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public User2DAO() {
		String DB_URL = "jdbc:oracle:thin:@192.168.0.03:1521:xe";
		String DB_USER = "c##team4";
		String DB_PASSWORD = "min";
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<User2> getList(){
		String query = "SELECT * FROM user_info";
		ArrayList<User2> list = new ArrayList<User2>();
		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				User2 user2 = new User2();
				user2.setU_no(rs.getInt(1));
				user2.setU_id(rs.getString(2));
				user2.setU_pw(rs.getString(3));
				user2.setU_name(rs.getString(4));
				user2.setU_gender(rs.getString(5));
				user2.setU_age(rs.getInt(6));
				user2.setU_loc(rs.getString(7));
				user2.setU_hobby(rs.getString(8));
				user2.setU_talent(rs.getString(9));
				user2.setU_mbti(rs.getString(10));
				user2.setU_like(rs.getInt(11));
				user2.setU_img(rs.getBlob(12));
				
				list.add(user2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
