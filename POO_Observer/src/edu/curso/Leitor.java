package edu.curso;

public class Leitor implements Observer {
	String nome;
	
	public Leitor(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Revista r) {
		System.out.println("Lendo o artigo " + r.artigo());
		
	}

}
