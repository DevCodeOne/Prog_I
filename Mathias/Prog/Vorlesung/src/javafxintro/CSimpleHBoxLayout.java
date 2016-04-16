package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CSimpleHBoxLayout extends Application
{
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      Button b1 = new Button("Open");
      Button b2 = new Button("Save");
      Button b3 = new Button("Exit");
      // Abstand zwischen den Elementen 10 Pixel
      HBox box = new HBox(10);
      // Paddings: top, right, bottom, left
      box.setPadding(new Insets(15, 12, 15, 12));
      box.getChildren().add(b1);
      box.getChildren().addAll(b2,b3);
      Scene scene = new Scene(box);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }

}
