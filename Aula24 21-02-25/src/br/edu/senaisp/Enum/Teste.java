package br.edu.senaisp.Enum;

public class Teste {

	public static void main(String[] args) {
		ESemana diaSemana = ESemana.valueOf("sab".toUpperCase());
		System.out.println(diaSemana.titulo);

		ESemana diaDaSemana = ESemana.SEX;

		if (diaDaSemana == ESemana.DOM || diaDaSemana == ESemana.SAB) {
			System.out.println("Ebaaaaa!");
		} else {
			System.out.println("Remunerado!");
		}

		for (ESemana s : ESemana.values()) {
			System.err.println(s.titulo + ":" + s.indice);
		}
		
//		System.err.println(diaDaSemana.values()[0]);

		qualquerCoisa(ESemana.SEX);

	}

	public static void qualquerCoisa(ESemana s) {

	}
}
