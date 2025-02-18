package br.edu.senaisp.model;

public class Aluno extends Pessoa {
	private Integer nrMatricula;

	public Aluno(String nome, String cpf, Integer nrMatricula) {
		super(nome, cpf);
		this.nrMatricula = nrMatricula;
	}

	public Integer getNrMatricula() {
		return nrMatricula;
	}

	public void setNrMatricula(Integer nrMatricula) {
		this.nrMatricula = nrMatricula;
	}

	@Override
	public String toString() {
		return nrMatricula + "|" + getNome() + "(" + getCpf() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (!(obj instanceof Aluno)) {
			return false;
		}
		
		Aluno tmp = (Aluno)obj;
		return this.nrMatricula.equals(tmp.nrMatricula);
	}
}
