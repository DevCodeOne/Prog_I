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

public class Aufgabe3 extends Application
{
	public void start(Stage primaryStage) throws Exception
	{
		// 1 h = 3600 s
		//1 min = 60 s
		Label lsekunden = new Label("Sekunden: ");
		TextField tsekunden = new TextField();
		Button bumrechnen = new Button("Umrechnung!");
		Separator s = new Separator();
		Label lerg = new Label("Ergebnis: ");
		TextField terg = new TextField();
		
		HBox hsekunden = new HBox(10);
		hsekunden.getChildren().addAll(lsekunden, tsekunden);
		hsekunden.setAlignment(Pos.CENTER);
		HBox humrechnen = new HBox(10);
		humrechnen.getChildren().addAll(bumrechnen);
		humrechnen.setAlignment(Pos.CENTER);
		HBox herg = new HBox(10);
		herg.getChildren().addAll(lerg, terg);
		herg.setAlignment(Pos.CENTER);
		
		VBox v = new VBox(10);
		v.setPadding(new Insets(10));
		v.getChildren().addAll(hsekunden, humrechnen, s, herg);
		
		Scene scene = new Scene(v);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		bumrechnen.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int sekges = Integer.parseInt(tsekunden.getText());
				int stu = sekges / 3600;
				int min = (sekges % stu) / 60;
				int sek = sekges - (stu * 3600) - (min * 60);
				terg.setText(" " + stu + " : " + min + " : " + sek);
			}
		});
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}

}
