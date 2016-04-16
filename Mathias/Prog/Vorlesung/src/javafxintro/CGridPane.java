package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
public class CGridPane extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      primaryStage.setScene(new Scene(addGridPane()));
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }

   public GridPane addGridPane()
   {
      GridPane grid = new GridPane();
      // Abstand zwischen den Zellen
      grid.setHgap(40);
      grid.setVgap(40);
      // top, right, bottom, left
      grid.setPadding(new Insets(50, 20, 50, 20));
      // Macht die Gitterlinien sichtbar => vereinfacht den Entwurf
      // grid.setGridLinesVisible(true);

      // Text - Spalte 1, Zeile 0
      Text text = new Text("Verkauf:");
      text.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      grid.add(text, 1, 0);

      // Titel Spalte 2 Zeile 0
      Text titel = new Text("Laufendes Jahr");
      titel.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      grid.add(titel, 2, 0);

      // Untertitel - Spalte 1 und 2, Zeile 1
      Text untertitel = new Text("Waren und Dienstleistungen");
      // CSS-like
      untertitel.setStyle("-fx-font-size: 20;");
      untertitel.setStyle("-fx-fill: ff00ff");

      grid.add(untertitel, 1, 1, 2, 1);

      // Bild in Spalte 0, Zeile 0 + 1
      ImageView hausBild = new ImageView(new Image(
            CGridPane.class.getResourceAsStream("../graphics/house.png")));
      hausBild.setStyle("-fx-cursor: hand");
      grid.add(hausBild, 0, 0, 1, 2);

      // linker Text Spalte 0, Zeile 2
      Text waren = new Text("Waren\n80%");
      GridPane.setValignment(waren, VPos.BOTTOM);
      grid.add(waren, 0, 2);

      // Chart in Spalte 1-2, Zeile 2
      ImageView imageChart = new ImageView(new Image(
            CGridPane.class.getResourceAsStream("../graphics/piechart.png")));
      HBox b = new HBox();
      b.setAlignment(Pos.CENTER);
      b.getChildren().add(imageChart);
      b.setStyle("-fx-cursor: wait");
      grid.add(b, 1, 2, 2, 1);

      // Rechter Text Spalte 3 Zeile 2
      Text dienstleistungen = new Text("Dienstleistungen\n20%");
      GridPane.setValignment(dienstleistungen, VPos.TOP);
      grid.add(dienstleistungen, 3, 2);
      return grid;
   }
}
