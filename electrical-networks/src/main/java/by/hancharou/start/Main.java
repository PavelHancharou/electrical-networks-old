package by.hancharou.start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import by.hancharou.dbcp.ConnectionManager;


public class Main {
	private BasicDataSource dataSource;

	private BasicDataSource getDataSource() {
		if (dataSource == null) {
			BasicDataSource ds = new BasicDataSource();
			ds.setUrl("jdbc:mysql://localhost/electrical_networks");
			ds.setUsername("root");
			ds.setPassword("pass");
			ds.setMinIdle(5);
			ds.setMaxIdle(10);
			ds.setMaxOpenPreparedStatements(100);
			dataSource = ds;
		}
		return dataSource;
	}

	public void sqlTest() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try (BasicDataSource dataSource = getDataSource();
				/*Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM tbl_ps;");*/
				Connection connection = ConnectionManager.getManager().getConnection();
				//Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM tbl_ps;");
				) {
			System.out.println("The Connection Object is of Class: " + connection.getClass());
			try (ResultSet resultSet = pstmt.executeQuery();) {
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + resultSet.getString(2));
				}
			} catch (Exception e) {
				connection.rollback();
				e.printStackTrace();
			} 
		} 
	}

}
