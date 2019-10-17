package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();
		Scene scn = new Scene(grid);
		grid.setStyle("-fx-padding:10px");
		GridPane buttons = new GridPane();
		
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(50);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(50);
		grid.getColumnConstraints().addAll(col1, col2);
		grid.setHgap(5);
		grid.setVgap(10);
		
		Label lblphone = new Label("Enter your phone number: ");
		TextField txtphone = new TextField();
		Label lblname = new Label("Enter your name: ");
		TextArea txtAname = new TextArea();
		txtAname.setMaxSize(200, 50);
		Button btnOk = new Button("Ok");
		Button btnCancel = new Button("Cancel");
		
		grid.add(lblphone, 0, 0);
		grid.add(txtphone, 1, 0);
		grid.add(lblname, 0, 1);
		grid.add(txtAname, 1, 1);
		buttons.add(btnOk, 0, 0);
		buttons.add(btnCancel, 1, 0);
		grid.add(buttons, 0, 3);
		
		stage.setScene(scn);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
