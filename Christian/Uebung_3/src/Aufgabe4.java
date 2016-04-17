import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aufgabe4 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		HBox str1_box = new HBox(10);
		HBox str2_box = new HBox(10);
		HBox ok_box = new HBox();
		HBox erg_box = new HBox(10);
		
		Label str1_l = new Label("String 1 :");
		TextField str1_t = new TextField();
		Label str2_l = new Label("String 2 :");
		TextField str2_t = new TextField();
		
		Button ok_b = new Button("OK");
		ok_b.setPrefWidth(100);
		ok_box.setAlignment(Pos.CENTER_RIGHT);
		
		Label erg_l = new Label("Ergebnis : ");
		
		str1_box.getChildren().addAll(str1_l, str1_t);
		str2_box.getChildren().addAll(str2_l, str2_t);
		ok_box.getChildren().add(ok_b);
		erg_box.getChildren().add(erg_l);
		
		vbox.getChildren().addAll(str1_box, str2_box, ok_box, erg_box);
		
		ok_b.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent ae) {
				char [] one = str1_t.getText().toCharArray();
				char [] second = str2_t.getText().toCharArray();
				boolean erg = false;
				
				if (second.length <= one.length) {
					int offset = (one.length - second.length);
					
					boolean string_vorne = true;
					boolean string_hinten = true;
					
					for (int i = 0; i < second.length; i++) {
						if (one[i] != second[i]) {
							string_vorne = false; 
						}
						
						if (one[i + offset] != second[i]) {
							string_hinten = false;
						}
					}
					
					erg = string_vorne | string_hinten;
				} else {
					erg = false;
				}
				
				erg_l.setText("Ergebnis : " + erg);
			}
			
		});
		
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
