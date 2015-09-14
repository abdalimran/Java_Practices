package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class sayHello extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		//Creating a Button
		Button btn = new Button();
		btn.setText("Say Hello");
		btn.setOnAction(new EventHandler<ActionEvent>() //Setting button handler 
		{			
			@Override
			public void handle(ActionEvent event) 
			{
				System.out.println("Bijon the Fucking Paul!");
			}
		});
		
		//Creating root and adding children to the StackPane
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		//Creating Scene for the root
		Scene scene = new Scene(root,400,400);
		
		//Preparing and showing the primary stage
		primaryStage.setTitle("Hello");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
