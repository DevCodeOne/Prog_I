package Aufgabe3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	Label lbl1,lbl2,lbl3;
	@FXML
	TextField tf1;
	
	@FXML
	public void bt1OnAction(ActionEvent e){
		int zeit=0;
		zeit = Integer.parseInt(tf1.getText());
		lbl3.setText("Sekunden: " + (zeit%60));
		zeit/=60;
		lbl2.setText("Minuten: " + (zeit%60));
		zeit/=60;
		lbl1.setText("Stunden: " + zeit);
	}
	
}
