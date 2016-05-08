package aufgabe1_2;

import java.math.BigInteger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	TextField tf1, tf2;
	@FXML
	Label lblErg;

	@FXML
	public void bt1OnAction(ActionEvent e) {
		try {
			BigInteger op1 = new BigInteger(tf1.getText());
			BigInteger op2 = new BigInteger(tf2.getText());
			lblErg.setText(op1.multiply(op2).toString());
		} catch (NumberFormatException p) {
			lblErg.setText("Keine Zahl!");
		}

	}

}
