package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();
		grid.setStyle("-fx-padding:10px");
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(50);
		ColumnConstraints col2= new ColumnConstraints();
		col2.setPercentWidth(50);
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setPercentWidth(50);
		ColumnConstraints col4 = new ColumnConstraints();
		col4.setPercentWidth(50);
		grid.getColumnConstraints().addAll(col1, col2, col3, col4);
		grid.setHgap(5);
		grid.setVgap(5);
		
		TextField screen = new TextField();
		Button btn0 = new Button("0");
		btn0.setMinSize(50, 50);
		Button btn1 = new Button("1");
		btn1.setMinSize(50, 50);
		Button btn2 = new Button("2");
		btn2.setMinSize(50, 50);
		Button btn3 = new Button("3");
		btn3.setMinSize(50, 50);
		Button btn4 = new Button("4");
		btn4.setMinSize(50, 50);
		Button btn5 = new Button("5");
		btn5.setMinSize(50, 50);
		Button btn6 = new Button("6");
		btn6.setMinSize(50, 50);
		Button btn7 = new Button("7");
		btn7.setMinSize(50, 50);
		Button btn8 = new Button("8");
		btn8.setMinSize(50, 50);
		Button btn9 = new Button("9");
		btn9.setMinSize(50, 50);
		Button btnPoint = new Button(".");
		btnPoint.setMinSize(50, 50);
		Button btnEqual = new Button("=");
		btnEqual.setMinSize(50, 50);
		Button btnAddition = new Button("+");
		btnAddition.setMinSize(50, 50);
		Button btnSubtraction = new Button("-");
		btnSubtraction.setMinSize(50, 50);
		Button btnMultiplication = new Button("*");
		btnMultiplication.setMinSize(50, 50);
		Button btnDivision = new Button("/");
		btnDivision.setMinSize(50, 50);
		Button btnClean = new Button("CE");
		btnClean.setMinSize(50, 50);
		
		grid.add(screen, 0, 0);
		GridPane.setColumnSpan(screen, 3);
		grid.add(btnClean, 3, 0);
		
		grid.add(btn1, 0, 1);
		grid.add(btn2, 1, 1);
		grid.add(btn3, 2, 1);
		grid.add(btnAddition, 3, 1);

		grid.add(btn4, 0, 2);
		grid.add(btn5, 1, 2);
		grid.add(btn6, 2, 2);
		grid.add(btnSubtraction, 3, 2);

		grid.add(btn7, 0, 3);
		grid.add(btn8, 1, 3);
		grid.add(btn9, 2, 3);
		grid.add(btnMultiplication, 3, 3);

		grid.add(btnPoint, 0, 4);
		grid.add(btn0, 1, 4);
		grid.add(btnEqual, 2, 4);
		grid.add(btnDivision, 3, 4);
		
		Scene scn = new Scene(grid);
		stage.setScene(scn);
		stage.show();
	}

	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
