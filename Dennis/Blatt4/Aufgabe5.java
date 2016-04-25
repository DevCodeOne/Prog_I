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

public class Aufgabe5 extends Application
{
	public void start(Stage primaryStage) throws Exception
	{
		Label lzahl_1 = new Label("Zahl 1: ");
		TextField tzahl_1 = new TextField();
		Label lzahl_2 = new Label("Zahl 2: ");
		TextField tzahl_2 = new TextField();
		Label lzahl_3 = new Label("Zahl 3: ");
		TextField tzahl_3 = new TextField();
		Button brechne =  new Button("Berechne!");
		Separator s = new Separator();
		Label lminimum = new Label("Minimum: ");
		TextField tminimum = new TextField();
		Label lmaximum = new Label("Maximum: ");
		TextField tmaximum = new TextField();
		Label lavg = new Label("Durchschnitt: ");
		TextField tavg = new TextField();
		
		HBox hzahl = new HBox(10);
		hzahl.getChildren().addAll(lzahl_1, tzahl_1, lzahl_2, tzahl_2, lzahl_3, tzahl_3);
		hzahl.setAlignment(Pos.CENTER);
		HBox hrechne = new HBox(10);
		hrechne.getChildren().addAll(brechne);
		hrechne.setAlignment(Pos.CENTER);
		HBox herg = new HBox(10);
		herg.getChildren().addAll(lminimum, tminimum, lmaximum, tmaximum, lavg, tavg);
		herg.setAlignment(Pos.CENTER);
		
		VBox v = new VBox(10);
		v.setPadding(new Insets(10));
		v.getChildren().addAll(hzahl, hrechne, s, herg);
		
		Scene scene = new Scene(v);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		brechne.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				double a = Integer.parseInt(tzahl_1.getText());
				double b = Integer.parseInt(tzahl_2.getText());
				double c = Integer.parseInt(tzahl_3.getText());
				if(a == b && b == c)
				{
					double avg = (a + b + c) / 3.0;
					tminimum.setText(" " + a);
					tmaximum.setText(" " + a);
					tavg.setText(" " + avg);
				}
				else
				{
					double min = Math.min(c,Math.min(a, b));
					double max = Math.max(c, Math.max(a,b));
					double avg = (a + b + c) / 3.0;
					tminimum.setText(" " + min);
					tmaximum.setText(" " + max);
					tavg.setText(" " + avg);
				}
			}
		});
	}
	public static void main(String[] args) 
	{
		launch(args);
	}

}
