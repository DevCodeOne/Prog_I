import java.math.BigInteger;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aufgabe1_2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox outer = new VBox(10); 
		HBox firstBox = new HBox(10);
		HBox secondBox = new HBox(10); 
		HBox thirdBox = new HBox(10);
		
		Label firstLabel = new Label("Operand 1"); 
		Label secondLabel = new Label("Operand 2"); 
		
		TextField firstField = new TextField(); 
		TextField secondField = new TextField(); 
		
		Button butt = new Button("*");
		
		Label thirdLabel = new Label("Ergebnis "); 
		TextField thirdField = new TextField(); 
		thirdField.setEditable(false);

		firstBox.getChildren().addAll(firstLabel, firstField); 
		secondBox.getChildren().addAll(secondLabel, secondField); 
		thirdBox.getChildren().addAll(thirdLabel, thirdField);
		
		outer.getChildren().addAll(firstBox, secondBox, butt, thirdBox);
		outer.setAlignment(Pos.CENTER);
		outer.setPadding(new Insets(10));
		
		butt.setOnAction((ActionEvent ae) -> { 
			BigInteger numberOne = new BigInteger(firstField.getText());
			BigInteger numberTwo = new BigInteger(secondField.getText());
			
			BigInteger erg = numberOne.multiply(numberTwo);
			thirdField.setText(erg.toString());
		});
		
		primaryStage.setScene(new Scene(outer));
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
