package project.dao;

public class ProjectDAO {
	
//	���ο� ProjectDAO �����ô�.
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
