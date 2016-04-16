package javafxintro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CStackPane extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      // Bemerkung: Text ist ein ,,node'', Label ist ein ,,Control''
      Text text = new Text("Programmieren macht Spass");
      Button b = new Button("OK");
      StackPane p  = new StackPane();
      p.getChildren().addAll(text, b);
      Scene scene = new Scene(p);
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }

}
