package br.edu.senaisp.model;

public class Cachorro extends Animal {
	private String nome;

	public Cachorro(String raca, String cor, String nome) {
		super(raca, cor);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String Latir( ) {
		return nome + ": Auau ";
	}
	
	public String Correr( ) {
		return nome + ": Correr";
	}
}
