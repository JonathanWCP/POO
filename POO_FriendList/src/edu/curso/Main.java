package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		GridPane grid = new GridPane();
		grid.setStyle("-fx-padding:10px");
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(30);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(70);
		
		grid.getColumnConstraints().addAll(col1, col2);
		grid.setHgap(5);
		grid.setVgap(10);
		Scene scn = new Scene(grid);
		
		FlowPane flow = new FlowPane();
		flow.setHgap(5);
		
		Label lblID = new Label("Id");
		TextField txtID = new TextField();
		Label lblNome = new Label("Nome");
		TextField txtNome = new TextField();
		Label lblTelefone = new Label("Telefone");
		TextField txtTelefone = new TextField();
		Button btnSalvar = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");
		
		
		grid.add(lblID, 0, 0);
		grid.add(txtID, 1, 0, 3, 1);
		grid.add(lblNome, 0, 1);
		grid.add(txtNome, 1, 1, 3, 1);
		grid.add(lblTelefone, 0, 2);
		grid.add(txtTelefone, 1, 2, 3, 1);
		flow.getChildren().addAll(btnSalvar, btnPesquisar);
		grid.add(flow, 0, 3, 3, 1);
		
		stage.setScene(scn);
		stage.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
}
