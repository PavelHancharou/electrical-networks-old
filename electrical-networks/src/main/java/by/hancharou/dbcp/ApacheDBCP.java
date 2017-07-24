package by.hancharou.dbcp;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ApacheDBCP {
	private InitialContext initialContext;
	private DataSource dataSource;
	
	public Connection getConnection() throws SQLException, NamingException, ClassNotFoundException	{
		initialContext = new InitialContext();
		dataSource = (DataSource) initialContext.lookup("java:/comp/env/jdbc/electrical_networks");
		return dataSource.getConnection();
	}
}
