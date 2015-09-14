package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Hello extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		BorderPane p=new BorderPane();
		Text t=new Text("Hello FX");
		t.setFont(Font.font("Consolas",60));
		p.setCenter(t);
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
