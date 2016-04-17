import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Aufgabe5 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();

		HBox box = new HBox(10);
		box.setAlignment(Pos.CENTER);
		
		Label l = new Label("Eingabe : ");
		TextField f = new TextField();
		Button b = new Button("OK");
		
		HBox.setHgrow(l, Priority.ALWAYS);
		HBox.setHgrow(f, Priority.ALWAYS);
		HBox.setHgrow(b, Priority.ALWAYS);
		box.getChildren().addAll(l, f, b);
		BorderPane.setMargin(box, new Insets(10));
		
		TextArea ta = new TextArea();
		ta.setEditable(false);
		BorderPane.setMargin(ta, new Insets(10));
		
		pane.setTop(box);
		pane.setCenter(ta);
		
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				int [] letters = new int[26];
				
				char [] in = f.getText().toLowerCase().toCharArray();
				
				for (int i = 0; i < in.length; i++) {
					if (in[i] >= 'a' && in[i] <= 'z') {
						letters[in[i] - 'a']++;
					}
				}
				
				StringBuilder builder = new StringBuilder();
				
				for (int i = 0; i < letters.length; i++) {
					if (letters[i] != 0) {
						builder.append(((char) (i + 'a')) + " -> " + letters[i] + "\n");
					}
				}
				
				ta.setText(builder.toString());
			}
			
		});
		
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}
}
