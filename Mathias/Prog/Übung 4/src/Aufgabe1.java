
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Aufgabe1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(addGridPane()));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public GridPane addGridPane() {
		GridPane grid = new GridPane();
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(10));
		// grid.setGridLinesVisible(true);

		Label lbop1 = new Label("Operand 1");
		grid.add(lbop1, 0, 0);

		TextField tf1 = new TextField();
		grid.add(tf1, 1, 0);

		Label lbop2 = new Label("Operand 2");
		grid.add(lbop2, 0, 1);

		TextField tf2 = new TextField();
		grid.add(tf2, 1, 1);

		HBox box = new HBox(6);
		Button b1 = new Button("+");		
		Button b2 = new Button("-");
		Button b3 = new Button("*");
		Button b4 = new Button("/");
		Button b5 = new Button("%");
		b1.setMinWidth(30);
		b2.setMinWidth(30);
		b3.setMinWidth(30);
		b4.setMinWidth(30);
		b5.setMinWidth(30);
		box.getChildren().addAll(b1, b2, b3, b4, b5);
		box.setAlignment(Pos.TOP_CENTER);
		grid.add(box, 0, 2, 2, 1);

		Label lbop3 = new Label("Ergebnis");
		grid.add(lbop3, 0, 3);

		TextField tf3 = new TextField();
		grid.add(tf3, 1, 3);
		b1.setOnAction((ActionEvent e) -> {
			tf3.setText("" + (Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
		});
		b2.setOnAction((ActionEvent e) -> {
			tf3.setText("" + (Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText())));
		});
		b3.setOnAction((ActionEvent e) -> {
			tf3.setText("" + (Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText())));
		});
		b4.setOnAction((ActionEvent e) -> {
			tf3.setText("" + (Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText())));
		});
		b5.setOnAction((ActionEvent e) -> {
			tf3.setText("" + (Integer.parseInt(tf1.getText()) % Integer.parseInt(tf2.getText())));
		});
		return grid;
	}
}
