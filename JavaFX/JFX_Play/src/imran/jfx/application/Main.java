package imran.jfx.application;
	
import java.net.URL;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) throws IOException 
	{
		URL url = getClass().getResource("Application_Controler.fxml");
		AnchorPane pane = FXMLLoader.load(url);
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);
		scene.getStylesheets().add(Main.class.getResource("AppStyle.css").toExternalForm());
		primaryStage.setTitle("JFx App");
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
