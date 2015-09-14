package imran.sqlite.connection;

import java.sql.*;

public class SQLite_Connection {

	public static void main(String args[]) throws Exception {
		
		Class.forName("org.sqlite.JDBC");
		
		String url="jdbc:sqlite:src/databases/test.sqlite";
		Connection conn = DriverManager.getConnection(url);
		
		String query = "select Id,Name,Dept,Mob from tbl";
		PreparedStatement doQuery = conn.prepareStatement(query);
		
		ResultSet result = doQuery.executeQuery();
		
		while (result.next()) 
		{
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
					+ result.getString(4));
		}
	}
}
