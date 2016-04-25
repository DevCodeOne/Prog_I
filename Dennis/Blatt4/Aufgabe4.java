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

public class Aufgabe4 extends Application
{
	public void start(Stage primaryStage) throws Exception
	{
		Label lplan = new Label("Geplante Ankunftszeit: ");
		TextField tplanh = new TextField();
		TextField tplanm = new TextField();
		TextField tplans = new TextField();
		Label lspät = new Label("Verspätung: ");
		TextField tspät = new TextField();
		Button bneu = new Button("neue Zeit berechnen!");
		Separator s = new Separator();
		Label ldanach = new Label("Neue Ankunftszeit: ");
		TextField tdanach = new TextField();
		
		HBox hplan = new HBox(10);
		hplan.getChildren().addAll(lplan, tplanh, tplanm, tplans);
		hplan.setAlignment(Pos.CENTER);
		HBox hspät = new HBox(10);
		hspät.getChildren().addAll(lspät, tspät);
		hspät.setAlignment(Pos.CENTER);
		HBox hneu = new HBox(10);
		hneu.getChildren().addAll(bneu);
		hneu.setAlignment(Pos.CENTER);
		HBox hdanach = new HBox(10);
		hdanach.getChildren().addAll(ldanach, tdanach);
		hdanach.setAlignment(Pos.CENTER);
		
		VBox v = new VBox(10);
		v.setPadding(new Insets(10));
		v.getChildren().addAll(hplan, hspät, hneu, s, hdanach);
		
		Scene scene = new Scene(v);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		bneu.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int vzeith = Integer.parseInt(tplanh.getText());
				int vzeitm = Integer.parseInt(tplanm.getText());
				int vzeits = Integer.parseInt(tplans.getText());
				int verspätung = Integer.parseInt(tspät.getText());				
				int nzeith = (vzeith + ((vzeitm + verspätung) / 60)) % 24;
				int nzeitm =(vzeitm + verspätung) % 60;
				tdanach.setText(" " + nzeith + ":" + nzeitm + ":" + vzeits);
			}
		});
	}

	public static void main(String[] args) 
	{
		launch(args);
	}

}
