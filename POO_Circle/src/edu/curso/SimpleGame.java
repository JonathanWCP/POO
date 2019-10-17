package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.EventHandler;

public class SimpleGame extends Application{

	Circle cir = new Circle(20);
	
	class Pos implements EventHandler<KeyEvent> {

		@Override
		public void handle(KeyEvent event) {
			if (event.getCode() == KeyCode.LEFT) {
				cir.setTranslateX(cir.getTranslateX()-1);
			} else if (event.getCode() == KeyCode.RIGHT) {
				cir.setTranslateX(cir.getTranslateX()+1);
			} else if (event.getCode() == KeyCode.UP) {
				cir.setTranslateY(cir.getTranslateY()-1);
			} else if (event.getCode() == KeyCode.DOWN) {
				cir.setTranslateY(cir.getTranslateY()+1);
			}
		}
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		EventHandler<KeyEvent> position = new Pos();
		GridPane grid = new GridPane();
		Scene scn = new Scene(grid);
		grid.setMinSize(640, 480);
		
		grid.add(cir, 0, 0);
		
		
		stage.addEventFilter(KeyEvent.KEY_PRESSED, position);
		stage.setScene(scn);
		stage.show();
	}

	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
