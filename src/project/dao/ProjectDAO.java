package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProjectDAO {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 연결 소스
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
}//
