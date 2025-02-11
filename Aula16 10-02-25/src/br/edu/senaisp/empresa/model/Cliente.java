package br.edu.senaisp.empresa.model;

public class Cliente extends Pessoa {

	private float credito;

	public Cliente(String nome, String cpf, float credito) {
		super(nome, cpf);
		this.credito = credito;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}

}
