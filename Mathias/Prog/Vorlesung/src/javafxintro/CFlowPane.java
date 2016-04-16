package javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Quelle http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm
public class CFlowPane extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      primaryStage.setScene(new Scene(addFlowPane()));
      primaryStage.show();

   }

   public static void main(String[] args)
   {
      launch(args);
   }

   private FlowPane addFlowPane()
   {
      FlowPane flow = new FlowPane();
      flow.setPadding(new Insets(5, 0, 5, 0));
      flow.setVgap(4);
      flow.setHgap(4);
      flow.setPrefWrapLength(170); // preferred width allows for two columns
      flow.setStyle("-fx-background-color: #DAE6F3;");

      // 8 Bilder vom Typ ImageView erzeugen und in den 
      // Container aufnehmen
      for (int i = 0; i < 8; i++)
      {
         ImageView view = new ImageView("graphics/chart_" + (i + 1) + ".png");
         flow.getChildren().add(view);
      }

      return flow;
   }
}
