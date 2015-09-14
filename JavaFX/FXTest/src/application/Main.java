package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root=FXMLLoader.load(getClass().getResource("/fxml/fxml.fxml"));
		Scene scene = new Scene(root,400,400);
		
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Image");
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}