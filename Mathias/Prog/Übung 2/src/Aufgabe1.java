import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.application.Application;

public class Aufgabe1 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button b1 = new Button("Open");
		Button b2 = new Button("Save");
		Button b3 = new Button("Help");
		Label lb = new Label();

		HBox box = new HBox(10);

		box.getChildren().addAll(b1, b2, lb, b3);

		lb.setMaxWidth(900);
		HBox.setHgrow(lb, Priority.ALWAYS);
		//lb.setPrefWidth(150);
		box.setPadding(new Insets(10));
		Scene scene = new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
