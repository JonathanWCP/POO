package edu.curso;



public class SuperInteressante implements Revista, Subject{

	
	public SuperInteressante(Leitor leitor) {
		leitor = registrar(leitor);
	}
	
	public void publicarArtigo(String artigo) {
		notificar(artigo);
	}
	
	@Override
	public void notificar(String artigo) {
		System.out.println("Artigo '" + artigo + "' publicado!");
		
	}

	@Override
	public Leitor registrar(Leitor leitor) {
		System.out.println("Leitor " + leitor.nome + " registrado!");
		return leitor;
	}

	@Override
	public String artigo() {
		// TODO Auto-generated method stub
		return null;
	}

}
