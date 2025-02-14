package br.edu.senaisp.empresa.model;

public class Funcionario extends Pessoa {

	private float salario;

	public Funcionario(String nome, String cpf, float salario) {
		super(nome, cpf);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
