import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class Aufgabe2 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button b1 = new Button("Essen 1");
		Button b2 = new Button("Essen 2");
		Button b3 = new Button("10 Cent");
		Button b4 = new Button("50 Cent");
		Label lb = new Label("Essensmarkenautomat");
		VBox vbox = new VBox(10);
		HBox box1 = new HBox(5);
		HBox box2 = new HBox(5);
		Separator sep1 = new Separator();
		Separator sep2 = new Separator();

		vbox.getChildren().addAll(lb, sep1, box1, sep2, box2);
		box1.getChildren().addAll(b1, b2);
		box2.getChildren().addAll(b3, b4);

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
