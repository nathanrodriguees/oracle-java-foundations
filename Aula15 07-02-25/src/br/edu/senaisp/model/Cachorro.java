package br.edu.senaisp.model;

public class Cachorro extends Animal {

	private String nome;
	
	public Cachorro() {}

	public Cachorro(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
		
	}
	
	public Cachorro(String nome, String raca, String cor) {
		this(nome, raca);
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String Latir( ) {
		return nome + ": Auau ";
	}
	
	public String Correr( ) {
		return nome + ": Correr";
	}

}
