import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Aufgabe1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Aufgabe3");
		
		Label op1 = new Label("Operand 1");
		TextField op1_in = new TextField();
		Label op2 = new Label("Operand 2");
		TextField op2_in = new TextField();
		Label erg = new Label("Ergebnis");
		TextField erg_out = new TextField();
		
		Button plus = new Button("+");
		Button minus = new Button("-");
		Button mal = new Button("*");
		Button durch = new Button("/");
		Button mod = new Button("%");
		
		erg_out.setEditable(false);
		
		EventHandler<ActionEvent> actions = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				int op1 = Integer.valueOf(op1_in.getText());
				int op2 = Integer.valueOf(op2_in.getText());
				int erg = 0;
				
				if (ae.getSource() instanceof Button) {
					switch(((Button) ae.getSource()).getText()) {
					case "+" : 
						erg = op1 + op2; 
						break; 
					case "-" : 
						erg = op1 - op2;
						break;
					case "*" :
						erg = op1 * op2; 
						break;
					case "/" :
						if (op2 != 0)
							erg = op1 / op2;
						break;
					case "%" : 
						if (op2 != 0) 
							erg = op1 % op2; 
						break;
					default :
						erg = 0;
					}
				}
				
				erg_out.setText(Integer.toString(erg));
			}
		};
		
		plus.setOnAction(actions);
		minus.setOnAction(actions);
		mal.setOnAction(actions);
		durch.setOnAction(actions);
		mod.setOnAction(actions);
		
		// Aufgabe 4 Anfang
		plus.setMaxWidth(50);
		minus.setMaxWidth(50);
		mal.setMaxWidth(50);
		durch.setMaxWidth(50);
		mod.setMaxWidth(50);
		
		HBox.setHgrow(plus, Priority.ALWAYS);
		HBox.setHgrow(minus, Priority.ALWAYS);
		HBox.setHgrow(mal, Priority.ALWAYS);
		HBox.setHgrow(durch, Priority.ALWAYS);
		HBox.setHgrow(mod, Priority.ALWAYS);
		
		// Aufgabe 4 Ende
		
		HBox box1 = new HBox(10);
		box1.getChildren().addAll(op1, op1_in);
		HBox box2 = new HBox(10);
		box2.getChildren().addAll(op2, op2_in);
		HBox box3 = new HBox(10);
		box3.getChildren().addAll(plus, minus, mal, durch, mod);
		box3.setAlignment(Pos.CENTER);
		HBox box4 = new HBox(10);
		box4.getChildren().addAll(erg, erg_out);
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(4, 4, 4, 4));
		
		grid.add(box1, 0, 0);
		grid.add(box2, 0, 1);
		grid.add(box3, 0, 2);
		grid.add(box4, 0, 3);
		
		primaryStage.setScene(new Scene(grid));
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
