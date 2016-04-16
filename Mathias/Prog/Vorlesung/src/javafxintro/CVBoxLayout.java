package javafxintro;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CVBoxLayout extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      Button b1 = new Button("Open");
      Button b2 = new Button("Save");
      Button b3 = new Button("Exit");
      // Ein Container für 3 Button - Abstand zwischen den Elementen 
      // ist hier 20 Pixel
      VBox box = new VBox(20);
      // Buttons in den Container aufnehmen
      box.getChildren().addAll(b1,b2,b3);
      // box als Wurzel für die Scene
      box.setAlignment(Pos.CENTER);
      VBox.setVgrow(b1, Priority.ALWAYS);
      b1.setMaxHeight(100);
      Scene scene = new Scene(box);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }

}
