package project.dao;

public class ProjectDAO {
	
//	새로운 ProjectDAO 생성.
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
