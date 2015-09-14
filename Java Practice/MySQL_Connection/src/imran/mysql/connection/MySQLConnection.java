package imran.mysql.connection;

import java.sql.*;

public class MySQLConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "newDB";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "abeer";

		try {
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url + dbName, userName, password);
			
			System.out.println("Connected with "+dbName+"!");
			
			PreparedStatement query = conn.prepareStatement("select id,word,bangla from tab");
			
			ResultSet result = query.executeQuery();
			
			while(result.next())
			{
				System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
			}
			//conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
