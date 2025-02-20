package br.edu.senaiso.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.edu.senaisp.model.Aluno;

public class AlunoDB {
	private static List<Aluno> listaDB = new ArrayList<Aluno>();

	public void insert(Aluno a) {
		Random geradorNumerico = new Random();
		a.setNrMatricula(Math.abs(geradorNumerico.nextInt()));
		listaDB.add(a);
	}

	public void update(Aluno a) {
		int i = listaDB.indexOf(a);
		if (i >= 0) {
			listaDB.set(i, a);
		}
	}

	public void delete(Aluno a) {
		int i = listaDB.indexOf(a);
		if (i >= 0) {
			listaDB.remove(i);
		}
	}

	public List<Aluno> selectAll() {
		return listaDB;
	}
}
