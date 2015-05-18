package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Conn {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	
	public Connection getConnection() throws Exception {
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		return con;
		
	}
	
}
