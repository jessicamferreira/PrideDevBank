package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection () throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://18.208.75.123/jel?useSSL=false","jel","secret");
		
		return con;
	}
}
