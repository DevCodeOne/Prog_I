package Aufgabe5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CharCount extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();

		Label lb1 = new Label("Eingabe");
		TextField tf1 = new TextField();
		tf1.setMinWidth(400);
		Button bt1 = new Button("OK");

		HBox box1 = new HBox();
		box1.setPadding(new Insets(5));
		HBox.setMargin(lb1, new Insets(5));
		HBox.setMargin(tf1, new Insets(5));
		HBox.setMargin(bt1, new Insets(5));
		box1.getChildren().addAll(lb1, tf1, bt1);
		borderPane.setTop(box1);
		box1.setAlignment(Pos.CENTER_LEFT);
		borderPane.setPadding(new Insets(10));

		TextArea ta = new TextArea();
		borderPane.setCenter(ta);
		bt1.setOnAction((ActionEvent e) -> {
			// ta.setText(StrCt(tf1.getText()));
			
			String s = "";
			int ascii = 97;
			for (int i = 0; i < 26; i++) {
				int n = 0;
				for (int j = 0; j < tf1.getText().length(); j++) {
					if (((int) tf1.getText().toLowerCase().charAt(j)) == ascii)
						n++;
				}
				if (n>0) s += ((char) ascii + " : " + n + System.getProperty("line.separator"));
				ascii++;
			}
			ta.setText(s);
		});
		primaryStage.setResizable(true);
		primaryStage.setScene(new Scene(borderPane, 700, 350));
		primaryStage.show();
	}

}
