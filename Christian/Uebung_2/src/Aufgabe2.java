import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aufgabe2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Aufgabe2");
		Label essensmarken = new Label("Essensmarkenautomat");
		Button essen1 = new Button("Essen 1");
		Button essen2 = new Button("Essen 2");
		Button zehn_cents = new Button("10 Cent");
		Button fuenfzig_cents = new Button("50 Cent");
		Separator sep1 = new Separator();
		Separator sep2 = new Separator();
		
		HBox essen = new HBox(10);
		essen.getChildren().addAll(essen1, essen2);
		HBox geld = new HBox(10);
		geld.getChildren().addAll(zehn_cents, fuenfzig_cents);
		
		VBox vbox = new VBox(10);
		vbox.getChildren().addAll(essensmarken, sep1, essen, sep2, geld);
		vbox.setPadding(new Insets(10, 10, 10, 10));
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String [] args) {
		launch(args);
	}
}
