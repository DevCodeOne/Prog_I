package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
public class CSimpleFlowPane2 extends Application
{
   static String[] TEXTE = {"public", "private", "protected", "default"};
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      // Vertikaler FlowPane
      FlowPane flow = new FlowPane(4, 4);
      flow.setPadding(new Insets(5, 0, 5, 0));
 //     flow.setPrefWrapLength(300); // bevorzugte Länge zum Umbruch
      flow.setStyle("-fx-background-color: #DAE6F3;");
      for (int i = 0; i < TEXTE.length; i++)
      {
         Button b = new Button(TEXTE[i]);
         flow.getChildren().add(b);
      }
      primaryStage.setScene(new Scene(flow));
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }

 
}
