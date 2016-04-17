import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aufgabe3 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		HBox first = new HBox(10);
		Label l = new Label("Text");
		TextField f = new TextField();
		first.getChildren().addAll(l, f);
		first.setAlignment(Pos.CENTER);
		
		HBox second = new HBox();
		Button o = new Button("OK");
		second.getChildren().add(o);
		second.setAlignment(Pos.CENTER);
		
		Separator sep = new Separator();
		
		Label l2 = new Label("Laenge");
		
		vbox.getChildren().addAll(first, second, sep, l2);
		
		o.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				l2.setText("Laenge : " + f.getText().length());				
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
