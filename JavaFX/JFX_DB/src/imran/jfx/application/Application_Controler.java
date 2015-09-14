package imran.jfx.application;

import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Application_Controler{
	
	ResultSet result;
	PreparedStatement doQuery;
	Connection conn;
	String query = "select Id,Name,Dept,Mob from tbl";
	
	public void Connect() throws Exception 
	{
		Class.forName("org.sqlite.JDBC");
		String url="jdbc:sqlite:src/databases/test.sqlite";
		conn = DriverManager.getConnection(url);
	
		doQuery = conn.prepareStatement(query);
		result = doQuery.executeQuery();
	}

    @FXML
    private TextArea output;

    @FXML
    private Button btn;

    @FXML
    void showData(ActionEvent event) throws Exception {
    	
    	Connect();
    	while (result.next()) 
		{
			String show = (result.getString(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + 
					"\t\t" + result.getString(4))+"\n";
			
			output.appendText(show);
		}
    }

}
