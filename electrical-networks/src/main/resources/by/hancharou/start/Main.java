package by.hancharou.start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import org.apache.commons.dbcp2.BasicDataSource;

import by.hancharou.connection_pool.App;

public class Main {
	private static BasicDataSource dataSource;

	private static BasicDataSource getDataSource() {
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

	public static void main(String[] args) throws SQLException {
		try (BasicDataSource dataSource = App.getDataSource();
				Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement("select * from tbl_tp;");) {
			System.out.println("The Connection Object is of Class: " + connection.getClass());
//			try (ResultSet resultSet = pstmt.executeQuery();) {
//				while (resultSet.next()) {
//					System.out.println(
//							resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
//				}
//			} catch (Exception e) {
//				connection.rollback();
//				e.printStackTrace();
//
//			}
		}
	}

}
