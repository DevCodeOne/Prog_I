package Blatt4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Separator;

public class Aufgabe2 extends Application
{
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Aufgabe 2 - Geldbetrag");
		
		Label fünfzig = new Label("50 Cent: ");
		TextField tfünfzig = new TextField();
		Label zwei = new Label("2 Cent: ");
		TextField tzwei = new TextField();
		Label eins = new Label("1 Cent: ");
		TextField teins = new TextField();
		Button b = new Button("Rechne!");
		Separator s = new Separator();
		Label betrag = new Label("Betrag: ");
		TextField tbetrag = new TextField();
		
		HBox hfünfzig = new HBox(10);
		hfünfzig.getChildren().addAll(fünfzig, tfünfzig);
		hfünfzig.setAlignment(Pos.CENTER);
		HBox hzwei = new HBox(10);
		hzwei.getChildren().addAll(zwei, tzwei);
		hzwei.setAlignment(Pos.CENTER);
		HBox heins = new HBox(10);
		heins.getChildren().addAll(eins, teins);
		heins.setAlignment(Pos.CENTER);
		HBox hb = new HBox(10);
		hb.getChildren().addAll(b);
		hb.setAlignment(Pos.CENTER);
		HBox hbetrag = new HBox(10);
		hbetrag.getChildren().addAll(betrag, tbetrag);
		hbetrag.setAlignment(Pos.CENTER);
		
		VBox v = new VBox(10);
		v.setPadding(new Insets(10));
		v.getChildren().addAll(hfünfzig, hzwei, heins, hb, s, hbetrag);
		
		Scene scene = new Scene(v);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		b.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				double efünfzig = 50 * Integer.parseInt(tfünfzig.getText());
				double ezwei = 2* Integer.parseInt(tzwei.getText());
				double eeins = Integer.parseInt(teins.getText());
				tbetrag.setText(" " + ((efünfzig + ezwei + eeins)/100));
			}
		});
		
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
