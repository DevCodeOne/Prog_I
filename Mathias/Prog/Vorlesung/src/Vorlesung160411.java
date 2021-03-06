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

public class Vorlesung160411 extends Application {

	public static void main(String[] args) {

		// System.out.println("hallo");

		// System.out.println(123); // über syso CTRL+Space
		// Autovervollständigung

		// String ist eine muteable Klasse zu erkennen am final im Klassenkopf.
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

		HBox box = new HBox(6);
		Button b1 = new Button("upperCase");

		b1.setOnAction((ActionEvent e) -> {
			//int text = Integer.parseInt(tf1.getText());
			//tf1.setText(text);
		});

		b1.setMinWidth(30);

		box.getChildren().addAll(b1);
		box.setAlignment(Pos.TOP_CENTER);
		grid.add(box, 0, 2, 2, 1);

		return grid;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(addGridPane()));
		primaryStage.show();
	}

}
