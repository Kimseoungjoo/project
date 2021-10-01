package project.dao;

public class ProjectDAO {
	
//	새로운 ProjectDAO 만들어봤다.
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
