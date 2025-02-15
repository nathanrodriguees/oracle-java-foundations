package br.edu.senaisp.model;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		Sala sala6 = new Sala(6, 20, "Chile");
		Professor prof = new Professor("Bittencourt", "555.555.555-55", 1023999);
		
		Turma xaxas = new Turma();
		xaxas.setId(123);
		xaxas.setCurso("Java Oracle Foundations");
		xaxas.setDuracao(80);
		xaxas.setSala(sala6);
		xaxas.setProfessor(prof);
		
//		Modo 1 de Fazer - Criar a lista e depois Get ela para preenchela	
		xaxas.setAlunos(new ArrayList<Aluno>());
		xaxas.getAlunos().add(new Aluno("João", "111.111.111-11", 456));
		xaxas.getAlunos().add(new Aluno("Nathan", "222.222.222-22", 789));
		xaxas.getAlunos().add(new Aluno("Matheus", "333.333.333-33", 123));
		
//		Modo 2 de Fazer - Se a classe turma ja tiver criado a lista, só peça-a com o Get e comece a preenche-la
//		xaxas.getAlunos().add(new Aluno("João", "111.111.111-11", 456));
//		xaxas.getAlunos().add(new Aluno("Nathan", "222.222.222-22", 789));
//		xaxas.getAlunos().add(new Aluno("Matheus", "333.333.333-33", 123));
		
	
// 		Modo 3 de Fazer - Crie a lista, preencha-a e depois é só SET na Turma
//		ArrayList<Aluno> lista = new ArrayList<Aluno>();
//		lista.add(new Aluno("João", "123", 456));
//		xaxas.setAlunos(lista);
		
		for (Aluno aluno : xaxas.getAlunos()) {
			System.out.println(aluno.getNome());
		}
	
		System.out.println(xaxas.getCurso());
		System.out.println(xaxas.getProfessor().getNome()); 
		
		

	}

}
