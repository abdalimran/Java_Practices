package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FxmlAppController 
{
    @FXML
    private TextField helloTF;

    @FXML
    private Button helloBtn;

    @FXML
    void sayHello(ActionEvent event) 
    {
    	helloTF.setText("Hello World!");
    }

}