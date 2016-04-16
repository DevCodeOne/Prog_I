package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
public class CSimpleFlowPaneVertical extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      FlowPane flow = new FlowPane(Orientation.VERTICAL);
      flow.setPadding(new Insets(5, 0, 5, 0));
      flow.setVgap(4);
      flow.setHgap(4);
      flow.setAlignment(Pos.TOP_RIGHT);
      flow.setPrefWrapLength(300); // bevorzugte Länge zum Umbruch
      flow.setStyle("-fx-background-color: #DAE6F3;");
      for (int i = 0; i < 8; i++)
      {
         Button b = new Button("Nr " + i);
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
