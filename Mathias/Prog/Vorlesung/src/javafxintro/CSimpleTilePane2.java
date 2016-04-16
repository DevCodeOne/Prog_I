package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
// Die Bilddateien sind also auch davon

// TilePane ist ein Container für Kacheln gleicher Größe
public class CSimpleTilePane2 extends Application
{

   static String[] TEXTE = {"public", "private", "protected", "default"};
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      // TilePane mit HGap = VGap = 4
      TilePane tileContainer = new TilePane(4,4);
      tileContainer.setPadding(new Insets(5, 0, 5, 0));
      // Bevozugte Anzahl von Spalten
      tileContainer.setPrefColumns(4);
      for (int i = 0; i < TEXTE.length; i++)
      {
         Button b = new Button(TEXTE[i]);
         TilePane.setAlignment(b, Pos.TOP_RIGHT);
  //       b.setAlignment(Pos.CENTER);
         tileContainer.getChildren().add(b);
      }
      // Hintergrund
      tileContainer.setStyle("-fx-background-color: #DAE6F3;");
      primaryStage.setScene(new Scene(tileContainer));
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }

 
}
