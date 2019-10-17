package model;

import java.util.Date;

public class Conta {
	private double saldo;
	private String numero;
	private String senha;
	Transacao[] historico;
	
	private boolean efetuarSaque(double valor) {
		return true;
	}
	
	private boolean efetuarDeposito(double valor) {
		return true;
	}
	
	private boolean efetuarPagamento(String boleto, double valor) {
		return true;
	}
	
	private Transacao[] extrato(Date inicio, Date fim) {
		return null;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
