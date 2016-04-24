import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Aufgabe2 extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(10));
		TilePane tile = new TilePane();
		tile.setHgap(10);
		tile.setPrefColumns(3);
		
		Label fif_lab = new Label("50 Cent Stücke");
		Label two_lab = new Label("2 Cent Stücke");
		Label one_lab = new Label("1 Cent Stücke");
		
		TextField fif_field = new TextField();
		TextField two_field = new TextField();
		TextField one_field = new TextField();
		
		tile.getChildren().addAll(fif_lab, two_lab, one_lab, fif_field, two_field, one_field);
		
		Separator sep = new Separator();
		sep.setPadding(new Insets(10));
		
		Label erg = new Label("In Euro :");
		Button b = new Button("Berechne");
		TextField erg_field = new TextField();
		
		erg_field.setEditable(false);
		
		HBox hbox = new HBox(10);
		hbox.getChildren().addAll(erg, erg_field, b);
		hbox.setAlignment(Pos.CENTER);
		
		pane.setTop(tile);
		pane.setCenter(sep);
		pane.setBottom(hbox);
		
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int fif = 0;
				int two = 0;
				int one = 0;
				
				if (!fif_field.getText().isEmpty())
					fif = Integer.valueOf(fif_field.getText());
				if (!two_field.getText().isEmpty())
						two = Integer.valueOf(two_field.getText());
				if (!one_field.getText().isEmpty())
					one = Integer.valueOf(one_field.getText());
				
				int erg = fif * 50 + two * 2 + one; 
				double erg_euro = erg / 100.0;
				
				erg_field.setText(Double.toString(erg_euro) + " euro");
			}
			
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
