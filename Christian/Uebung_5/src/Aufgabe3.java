import java.util.Arrays;

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

public class Aufgabe3 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox outer = new VBox(10); 
		HBox firstBox = new HBox(10); 
		HBox secondBox = new HBox(10);
		
		TextField firstField = new TextField(); 
		Label firstLabel = new Label("Zahl");
		
		Button butt = new Button("Berechne");
		
		Label secondLabel = new Label("Erg");
		TextField secondField = new TextField();
		
		firstBox.getChildren().addAll(firstLabel, firstField);
		secondBox.getChildren().addAll(secondLabel, secondField); 
		
		outer.getChildren().addAll(firstBox, butt, secondBox);
		
		butt.setOnAction((ActionEvent ae) -> {
			int erg [] = zerlegeInPrim(Integer.valueOf(firstField.getText()));
			secondField.setText(Arrays.toString(erg));
		});
		
		outer.setAlignment(Pos.CENTER);
		outer.setPadding(new Insets(10));
		
		primaryStage.setScene(new Scene(outer));
		primaryStage.show();
	}

	public static void main(String [] args) {
		launch(args);
	}
	
	public static int[] zerlegeInPrim(int number) {
		// worst case nur zweien maximale anzahl von teilern
		int numbers[] = new int[(number / 2 + 1)]; 
		int index = 0;
		int div = 2;
		
		while(number != 1) {
			while(number % div != 0) div++;
			
			number /= div;
			numbers[index++] = div;
			
			div = 2; // starte von vorne
		}
		
		return Arrays.copyOfRange(numbers, 0, index);
	}
}
