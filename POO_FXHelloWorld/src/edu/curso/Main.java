package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GridPane panel = new GridPane();
		panel.setHgap(3);
		Scene scn = new Scene(panel);
		stage.setScene(scn);
		stage.setTitle("Hello World");
		Label hello = new Label("Hello World");
		panel.add(hello, 1, 1);
		
		panel.setMinSize(320, 240);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
