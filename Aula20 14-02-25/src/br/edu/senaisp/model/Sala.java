package br.edu.senaisp.model;

public class Sala {
	private Integer nrSala;
	private int capacidade;
	private String coordenacao;

	public Sala(Integer nrSala, int capacidade, String coordenacao) {
		this.nrSala = nrSala;
		this.capacidade = capacidade;
		this.coordenacao = coordenacao;
	}

	public Integer getNrSala() {
		return nrSala;
	}

	public void setNrSala(Integer nrSala) {
		this.nrSala = nrSala;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getCoordenacao() {
		return coordenacao;
	}

	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao;
	}

}
