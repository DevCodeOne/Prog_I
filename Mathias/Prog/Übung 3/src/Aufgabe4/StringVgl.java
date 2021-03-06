package Aufgabe4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;

public class StringVgl extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox(10);

		HBox box1 = new HBox(5);
		box1.setAlignment(Pos.CENTER);
		Label lb1 = new Label("String 1:");
		TextField tf1 = new TextField();

		HBox box2 = new HBox(5);
		box2.setAlignment(Pos.CENTER);
		Label lb2 = new Label("String 2:");
		TextField tf2 = new TextField();

		HBox box3 = new HBox(5);
		box3.setAlignment(Pos.CENTER);
		Label lb3 = new Label("");
		lb3.setMinWidth(60);
		Button b1 = new Button("OK");
		b1.setMinWidth(100);

		HBox box4 = new HBox(5);
		box4.setAlignment(Pos.CENTER_LEFT);
		Label lb4 = new Label("Ergebnis:");

		vbox.getChildren().addAll(box1, box2, box3, box4);
		box1.getChildren().addAll(lb1, tf1);
		box2.getChildren().addAll(lb2, tf2);
		box3.getChildren().addAll(lb3, b1);
		box4.getChildren().addAll(lb4);

		b1.setOnAction((ActionEvent e) -> {
			lb4.setText(StringVergleich(tf1.getText(), tf2.getText()));
		});
		vbox.setPadding(new Insets(10));
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public String StrVg(String b, String a) {
		if (b.startsWith(a))
			return "Anfang";
		if (b.endsWith(a))
			return "Ende";
		return "Weder noch!";
	}

	public String StringVergleich(String a, String b) {
		char[] bchar = b.toLowerCase().toCharArray();
		char[] achar = a.toLowerCase().toCharArray();
		for (int i = 0; i < bchar.length; i++) {
			if (achar[i] == bchar[i])
				return "Anfang";
			if (achar[i + achar.length - bchar.length] == bchar[i])
				return "Ende";
		}
		return "Weder noch!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
