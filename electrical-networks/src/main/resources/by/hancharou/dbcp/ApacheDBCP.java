package by.hancharou.dbcp;

public class ApacheDBCP {
	private InitialContext initialContext;
	private DataSource dataSource;
	
	public Connection getConnection() throws SQLException, NamingException	{
		initialContext = new InitialContext();
		dataSource = (DataSource) initialContext.lookup("java:/comp/env/jdbc/electrical_networks"); // вместо написать java:/comp/env/jdbc/TestDB
		return dataSource.getConnection();
	}
}
