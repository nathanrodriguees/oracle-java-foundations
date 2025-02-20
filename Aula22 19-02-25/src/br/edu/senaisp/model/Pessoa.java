package br.edu.senaisp.model;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private int anoNascimento;

	public Pessoa(String nome, String cpf, int anoNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}

	public abstract int calcIdade();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
