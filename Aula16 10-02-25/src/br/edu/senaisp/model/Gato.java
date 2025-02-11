package br.edu.senaisp.model;

public class Gato extends Animal {

	public Gato(String raca, String cor, String corDoBigode) {
		super(raca, cor);
		this.corDorBigode = corDoBigode;
	}

	protected String corDorBigode;
	
	public String pular() {
		return ".....ZIP....";
	}
}
