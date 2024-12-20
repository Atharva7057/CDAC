package dac.assignment1.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	static Connection con;
	
	public static Connection estConnection() {
		String url = "jdbc:mysql://localhost:3306/advjava";
		try {
			con = DriverManager.getConnection(url,"Atharva","cdac");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
