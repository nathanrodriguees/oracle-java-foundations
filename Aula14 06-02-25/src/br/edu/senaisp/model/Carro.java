package br.edu.senaisp.model;

public class Carro {
	
	private String nome;
	private String marca;
	private float km;
	private String cor;
	private String placa;
	private String nomeCliente;

	public Carro(String nome, String marca, float km, String cor, String placa, String nomeCliente) {
		this.nome = nome;
		this.marca = marca;
		this.km = km;
		this.cor = cor;
		this.placa = placa;
		this.nomeCliente = nomeCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase(); // Converte para maiusculo
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
