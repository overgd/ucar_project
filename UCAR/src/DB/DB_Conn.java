package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB_Conn {
	
	Statement stmt;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	
	public Connection getConnection() throws Exception {
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		stmt = con.createStatement();
		return con;
		
	}
	
}
