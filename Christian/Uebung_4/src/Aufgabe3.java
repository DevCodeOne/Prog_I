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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aufgabe3 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox box = new VBox(10);
		box.setPadding(new Insets(10));
		HBox hbox = new HBox(10);
		HBox hbox2 = new HBox();
		hbox2.setAlignment(Pos.CENTER);
		Label sek = new Label("Anzahl Sekunden");
		TextField sek_ein = new TextField();
		HBox.setHgrow(sek_ein, Priority.ALWAYS);
		Button calc = new Button("Berechne");
		Separator sep = new Separator();
		TilePane tile = new TilePane();
		tile.setPrefColumns(2);
		tile.setHgap(10);
		tile.setVgap(10);
		
		Label stunden = new Label("Stunden : "); 
		Label minuten = new Label("Minuten : ");
		Label sekunden = new Label("Sekunden : ");
		
		TextField stunden_aus = new TextField();
		TextField minuten_aus = new TextField();
		TextField sekunden_aus = new TextField(); 
		
		stunden_aus.setEditable(false);
		minuten_aus.setEditable(false);
		sekunden_aus.setEditable(false);
		
		tile.getChildren().addAll(stunden, stunden_aus, minuten, minuten_aus, 
				sekunden, sekunden_aus);
		
		calc.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int sekund = 0;
				
				if (!sek_ein.getText().isEmpty())
					sekund = Integer.valueOf(sek_ein.getText());
				
				int stund = sekund / (60 * 60); 
				sekund %= 60 * 60;
				int minut = sekund / 60; 
				sekund %= 60;
				
				stunden_aus.setText(Integer.toString(stund));
				minuten_aus.setText(Integer.toString(minut));
				sekunden_aus.setText(Integer.toString(sekund));
			}
			
		});
		
		hbox.getChildren().addAll(sek, sek_ein);
		hbox2.getChildren().add(calc);
		box.getChildren().addAll(hbox, hbox2, sep, tile);
		
		Scene scene = new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
