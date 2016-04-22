package Aufgabe2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	TextField tf1,tf2,tf3;
	@FXML
	Label lblAusgabe;
	
	@FXML
	public void bt1onAction(ActionEvent e) {
		int cent=0;
		cent = Integer.parseInt(tf1.getText())*50;
		cent += Integer.parseInt(tf2.getText());
		cent += Integer.parseInt(tf3.getText());
		lblAusgabe.setText((cent/100) + " Euro " + cent%100 + " Cent");
	}
	
	
	
}
