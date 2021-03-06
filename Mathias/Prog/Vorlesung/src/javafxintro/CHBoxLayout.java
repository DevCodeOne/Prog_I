package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CHBoxLayout extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      Button b1 = new Button("Text");     

      b1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
      b1.setStyle("-fx-text-fill: blue;");
      Button b2 = new Button("Save");
      Button b3 = new Button("Exit");
      // Ein Container f�r 3 Button - Abstand zwischen den Elementen 
      // ist hier 10 Pixel
      HBox box = new HBox(10);
      // top, right, bottom, left
      box.setPadding(new Insets(15, 12, 15, 12));
      // box.setSpacing(10);
      // Hintergrundfarbe #rrggbb  rr, gg, bb Hex-Werte
      box.setStyle("-fx-background-color: #336600;");
      // Buttons in den Container aufnehmen
      box.getChildren().addAll(b1,b2,b3);
      // Elemente werden zentriert dargestellt
      box.setAlignment(Pos.CENTER);
      HBox.setHgrow(b1, Priority.NEVER);
      b1.setMaxWidth(100); // bis max. 100 Pixel
      HBox.setHgrow(b2, Priority.ALWAYS);
      b2.setMaxWidth(200); // bis max. 200 Pixel
      Scene scene = new Scene(box);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }

}
