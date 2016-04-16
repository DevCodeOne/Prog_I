package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
public class CSimpleGridPane extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      GridPane grid = new GridPane();
      grid.setHgap(40);  // Abstand zwischen
      grid.setVgap(40);  // den Zeilen und Spalten
      // top, right, bottom, left
      grid.setPadding(new Insets(50, 20, 50, 20));
      // Macht die Gitterlinien sichtbar => vereinfacht den Entwurf
      grid.setGridLinesVisible(true);
      // Text - Spalte 0, Zeile 0
      Text text = new Text("Verkauf:");
      text.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      grid.add(text, 0, 0);
      // Titel Spalte 1 Zeile 0
      Text titel = new Text("Laufendes Jahr");
  //    titel.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      grid.add(titel, 1, 0);  // Spalte 1 Zeile 0
      Text untertitel = new Text("Waren und Dienstleistungen");
      untertitel.setStyle("-fx-font-family: Arial; "
            + "-fx-font-weight: bold; -fx-font-size: 20;-fx-fill: ff00ff");
      grid.add(untertitel, 0, 1, 2, 1);  // Spalte 0, Zeile 1, 2 Spalten, 1 Zeile
      primaryStage.setScene(new Scene(grid));
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }


}
