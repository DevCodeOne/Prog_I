package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
// Die Bilddateien sind also auch davon

// TilePane ist ein Container für Kacheln gleicher Größe - ähnlich wie FlowPane
public class CTilePane extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      primaryStage.setScene(new Scene(addTilePane()));
      primaryStage.setResizable(false);
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }

   private TilePane addTilePane()
   {
      // TilePane mit HGap = VGap = 4
      TilePane tile = new TilePane(4,4);
      tile.setPadding(new Insets(5, 0, 5, 0));
      // Bevozugte Anzahl von Spalten
      tile.setPrefColumns(4);
      // Hintergrund
      tile.setStyle("-fx-background-color: #DAE6F3;");

      // Bilder in den Container aufnehmen
      ImageView pages[] = new ImageView[8];
      for (int i = 0; i < 8; i++)
      {
         pages[i] = new ImageView(new Image(CTilePane.class
               .getResourceAsStream("../graphics/chart_" + (i + 1) + ".png")));
         tile.getChildren().add(pages[i]);
      }
      return tile;
   }
}
