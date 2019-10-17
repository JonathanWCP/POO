package edu.curso;

public class Principal {
	public static void main(String[] args) {
		Leitor leitor = new Leitor("Robson");
		SuperInteressante sup = new SuperInteressante(leitor);
		sup.publicarArtigo("Fatec ZL faz parceria com o MIT para desenvolvimento de novas tecnologias");
	}
	
	
	
	
}
