package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		Button btn=new Button("Click Me");
		btn.setOnAction(e->btn_click());
		
		StackPane frame=new StackPane();
		frame.getChildren().add(btn);
		Scene scene=new Scene(frame,500,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
	}
	
	public void btn_click()
	{
		System.out.println("Hello man! Wellcome to JavaFX!");
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
