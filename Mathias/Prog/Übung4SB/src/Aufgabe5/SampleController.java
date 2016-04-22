package Aufgabe5;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	TextField tf1, tf2, tf3,tfmin,tfmax,tfmid;

	@FXML
	public void bt1OnAction(ActionEvent e){
		double z1,z2,z3, tmp;
		tmp = 0;
		z1 = Integer.parseInt(tf1.getText());
		z2 = Integer.parseInt(tf2.getText());
		z3 = Integer.parseInt(tf3.getText());
		tfmid.setText("" + ((z1+z2+z3)/3));
		if ( z3<z2) {
			tmp = z3;
			z3 = z2;
			z2 = tmp;
		}
		if (z2<z1)	{
			tmp = z2;
			z2 = z1;
			z1 = tmp;
		}
		if ( z3<z2) {
			tmp = z3;
			z3 = z2;
			z2 = tmp;
		}
		tfmin.setText("" + z1);
		tfmax.setText("" + z3);
	}

}
