package br.edu.senaisp.Enum;

public enum ESemana {
	DOM("Domingo", 1), SEG("Segunda", 2), TER("Terça", 3), QUA("Quarta", 4), QUI("Quinta", 5), SEX("Sexta", 6),
	SAB("Sábado", 7);

	public String titulo;
	public int indice;

	ESemana(String s, int indice) {
		this.titulo = s;
		this.indice = indice;
	}
}
