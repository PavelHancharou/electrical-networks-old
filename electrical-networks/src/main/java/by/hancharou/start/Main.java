package by.hancharou.start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.hancharou.dbcp.ConnectionManager;


public class Main {
	private Connection connection;
	private PreparedStatement pStatement;
	private ResultSet resultSet;
	
	public void sqlTest() throws SQLException, ClassNotFoundException {
		try{
			connection = ConnectionManager.getManager().getConnection();
			pStatement = connection.prepareStatement("SELECT * FROM tbl_ps;");
			resultSet = pStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + resultSet.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.getManager().closeDbResources(connection, pStatement, resultSet);
		}
	}
}
