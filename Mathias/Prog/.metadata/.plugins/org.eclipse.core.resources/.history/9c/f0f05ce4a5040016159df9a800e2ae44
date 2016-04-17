
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
public class Aufgabe17 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TilePane tile = new TilePane(3, 3);
		tile.setPrefColumns(10);
		tile.setPrefRows(5);
		for (int i = 0; i < 50; i++) {
			Button b = new Button("Nr " + (i+1));
			tile.getChildren().add(b);
		}
		primaryStage.setScene(new Scene(tile));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
