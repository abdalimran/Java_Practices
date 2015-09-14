package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		Button btn = new Button();
		btn.setText("Click Me!");
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				System.out.println("Hello JavaFX");
			}
		});
		
		StackPane root=new StackPane();
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root,400,400);
		
		primaryStage.setTitle("JFX App");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}