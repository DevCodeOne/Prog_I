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

// TilePane ist ein Container f�r Kacheln gleicher Gr��e
public class CSimpleTilePane extends Application
{

 
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      // TilePane mit HGap = VGap = 4
      TilePane tileContainer = new TilePane(4,4);
      tileContainer.setPadding(new Insets(5, 0, 5, 0));
      // Bevozugte Anzahl von Spalten
      tileContainer.setPrefColumns(3);
      for (int i = 0; i < 8; i++)
      {
         Button b = new Button("" + i);
         b.setAlignment(Pos.CENTER);
         tileContainer.getChildren().add(b);
      }
      // Hintergrund
      tileContainer.setStyle("-fx-background-color: #DAE6F3;");
      primaryStage.setScene(new Scene(tileContainer));
      // Gr��e der Anwendung kann nicht ge�ndert werden
      //primaryStage.setResizable(false);
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }

 
}
