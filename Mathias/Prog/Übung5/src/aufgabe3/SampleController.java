package aufgabe3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	TextField tf1;
	@FXML
	Label lblErg;

	@FXML
	public void bt1OnAction(ActionEvent e) {
		StringBuilder str = new StringBuilder();
		try {
		int z = Integer.parseInt(tf1.getText());
		for (int i = 2; i <= z; i++) {
			if (z % i == 0) {
				str.append(i);
				z /= i;
				i = 1;
				if (z != 1)
					str.append(", ");
			}

		}
		lblErg.setText(str.toString());
		}
		catch (NumberFormatException c){
			lblErg.setText("keine Zahl oder Zahl zu lang!");
		}
	}

}
