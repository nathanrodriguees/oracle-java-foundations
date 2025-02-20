package br.edu.senaisp.model;

public class Professor extends Pessoa {
	private Integer id;

	public Professor(String nome, String cpf, Integer id, int ano) {
		super(nome, cpf, ano);
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int calcIdade() {
		return 0;
	}

}
