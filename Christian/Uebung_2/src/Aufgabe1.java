import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Aufgabe1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Aufgabe1");
		Button open = new Button("Open");
		Button save = new Button("Save");
		Label space = new Label("");
		Button help = new Button("Help");

		HBox box = new HBox(10);
		box.getChildren().addAll(open, save, space, help);
		box.setPrefWidth(400);
		
		// vergrößere Label automatisch, dass nicht genutzer Raum genutzt wird
		// setze maxwidth anders wird die maximale Größe durch den Textinhalt angegeben
		space.setMaxWidth(400);
		HBox.setHgrow(space, Priority.ALWAYS);
		
		// inneres offset (4 Pixel in alle Richtungen)
		box.setPadding(new Insets(10, 10, 10, 10));
		Scene scene = new Scene(box);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
