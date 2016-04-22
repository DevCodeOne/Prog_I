package Aufgabe4;

import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.sql.*;

public class SampleController {
	@FXML
	TextField tf1, tf2, tf3;

	@FXML
	public void bt1OnAction(ActionEvent e){
		String[] str = new String[3];
		int s=0;
		str = tf1.getText().split(Pattern.quote(":"));
		s = Integer.parseInt(str[0])*1000*60*60;
		s += Integer.parseInt(str[1])*1000*60;
		s += Integer.parseInt(str[2])*1000;
		s += Integer.parseInt(tf2.getText())*1000*60;
		Time t = new Time(s);
		tf3.setText(t.toString());
		
	}

}
