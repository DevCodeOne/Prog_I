package Aufgabe3;

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
import javafx.application.Application;
import javafx.event.ActionEvent;

public class Test1GUI extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {		
		VBox vbox = new VBox(10);
		
		HBox box1 = new HBox(5);
		box1.setAlignment(Pos.CENTER);
		Label lb1 = new Label("Text:");
		TextField tf1 = new TextField();
		
		HBox box2 = new HBox(5);
		box2.setAlignment(Pos.CENTER);
		Button b1 = new Button("OK");
				
		Separator sep1 = new Separator();
		
		HBox box3 = new HBox(5);
		box3.setAlignment(Pos.CENTER_LEFT);
		Label lb2 = new Label("Länge:");
		
		
		vbox.getChildren().addAll(box1, box2, sep1, box3);
		box1.getChildren().addAll(lb1, tf1);
		box2.getChildren().addAll(b1);
		box3.getChildren().addAll(lb2);

		b1.setOnAction((ActionEvent e) -> {
			lb2.setText("Länge: " + tf1.getText().length());
		});
		vbox.setPadding(new Insets(10));
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
