package imran.jfx.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Calculator_Controler {

    @FXML
    private TextArea num1;

    @FXML
    private TextArea num2;

    @FXML
    private Button add;

    @FXML
    private Button subtract;
    
    @FXML
    private Button multiply;
    
    @FXML
    private Button division;

    @FXML
    private TextArea result;

    @FXML
    void doAdd(ActionEvent event) {
    	int n1, n2, ans;

		try {
			n1 = Integer.parseInt(num1.getText());
			n2 = Integer.parseInt(num2.getText());
			ans = n1 + n2;

			result.setText(Integer.toString(ans));

		} catch (Exception e1) {
			System.out.println("Please enter valid number");
		}
    }

    @FXML
    void doSubtract(ActionEvent event) {
    	int n1, n2, ans;

		try {
			n1 = Integer.parseInt(num1.getText());
			n2 = Integer.parseInt(num2.getText());
			ans = n1 - n2;

			result.setText(Integer.toString(ans));

		} catch (Exception e1) {
			System.out.println("Please enter valid number");
		}
    }
    
    @FXML
    void doMultiply(ActionEvent event) {
    	int n1, n2, ans;

		try {
			n1 = Integer.parseInt(num1.getText());
			n2 = Integer.parseInt(num2.getText());
			ans = n1 * n2;

			result.setText(Integer.toString(ans));

		} catch (Exception e1) {
			System.out.println("Please enter valid number");
		}
    }
    
    @FXML
    void doDivision(ActionEvent event) {
    	double n1, n2, ans;

		try {
			n1 = Double.parseDouble(num1.getText());
			n2 = Double.parseDouble(num2.getText());
			ans = n1/n2;

			result.setText(Double.toString(ans));

		} catch (Exception e1) {
			System.out.println("Please enter valid number");
		}
    }

}