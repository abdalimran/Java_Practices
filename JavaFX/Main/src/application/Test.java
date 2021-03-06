package application;

import java.util.List;
//from   w  w  w  .  j a v a 2 s. com
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Test extends Application 
{

    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("Title");
        
        final Parameters params = getParameters();
        final List<String> parameters = params.getRaw();
        final String imageUrl = !parameters.isEmpty() ? parameters.get(0) : "";
        
        primaryStage.show();
    }
}
