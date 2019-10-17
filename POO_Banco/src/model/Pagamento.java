package model;

public class Pagamento extends Transacao {
	private String boleto;

	public String getBoleto() {
		return boleto;
	}

	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}
}
