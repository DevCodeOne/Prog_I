package Blatt4;

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
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Aufgabe 3 - �bung 2");
        Label op1 = new Label("Operand 1");
        TextField op1_1 = new TextField();
        Label op2 = new Label("Operand 2");
        TextField op2_2 = new TextField();
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button mal = new Button("*");
        Button geteilt = new Button("/");
        Button rest = new Button("%");
        Label erg = new Label("Ergebnis");
        TextField erge = new TextField();

        HBox op1_1_1 = new HBox(10);
        op1_1_1.getChildren().addAll(op1, op1_1);
        HBox op2_2_2 = new HBox(10);
        op2_2_2.getChildren().addAll(op2, op2_2);
        HBox sign = new HBox(10);
        sign.getChildren().addAll(plus, minus, mal, geteilt, rest);
        sign.setAlignment(Pos.CENTER);
        HBox erg_1 = new HBox(10);
        erg_1.getChildren().addAll(erg, erge);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.add(op1_1_1, 0, 0);
        grid.add(op2_2_2, 0, 1);
        grid.add(sign, 0, 2);
        grid.add(erg_1, 0, 3);

        plus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int a = Integer.parseInt(op1_1.getText());
                int b = Integer.parseInt(op2_2.getText());
                erge.setText("" + (a + b));
            }
        });

        minus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int a = Integer.parseInt(op1_1.getText());
                int b = Integer.parseInt(op2_2.getText());
                erge.setText("" + (a - b));
            }
        });

        mal.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int a = Integer.parseInt(op1_1.getText());
                int b = Integer.parseInt(op2_2.getText());
                erge.setText("" + (a * b));
            }
        });

        geteilt.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                double a = Integer.parseInt(op1_1.getText());
                double b = Integer.parseInt(op2_2.getText());
                erge.setText("" + (a / b));
            }
        });

        rest.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int a = Integer.parseInt(op1_1.getText());
                int b = Integer.parseInt(op2_2.getText());
                erge.setText("" + (a % b));
            }
        });

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}