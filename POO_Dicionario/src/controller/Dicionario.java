package controller;

import java.util.Map;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Dicionario {
	Map<String, String> words = new HashMap<>();
	
	public void adicionarDefinicao() {
		String nome = "", definicao = "";
		nome = JOptionPane.showInputDialog("Digite o nome desta palavra ");
		definicao = JOptionPane.showInputDialog("Digite a definicao desta palavra");
		
		words.put(nome, definicao);
		JOptionPane.showMessageDialog(null, "A Palavra " + nome + " foi adicionada!");
	}
	
	public void consultarDefinicao() {
		String consulta = "";
		consulta = JOptionPane.showInputDialog("Digite o nome da palavra para consultar no dicionario");
		
		JOptionPane.showMessageDialog(null, 
				(words.containsKey(consulta))? "Definicao: " + words.get(consulta) : "Nao há registro dessa palavra no dicionario!");
		
	}
}
