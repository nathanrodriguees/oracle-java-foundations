package br.edu.senaisp.empresa;

import java.util.ArrayList;

import br.edu.senaisp.empresa.model.Cliente;
import br.edu.senaisp.empresa.model.Funcionario;
import br.edu.senaisp.empresa.model.Pessoa;

public class Teste {
	public static void main(String[] args) {

//		Funcionario f1 = new Funcionario("Cleiton","000.000.000-00", 1518.00f);
//		Cliente c1 = new Cliente("Robinho","111.111.111-11", 2000.00f);
//		
//		System.out.printf("O cliente é: %s%n", c1.getNome());
//		System.out.printf("O funcionario é: %s%n", f1.getNome());

		ArrayList<Pessoa> lista = new ArrayList<>();

		lista.add(new Pessoa("Cleiton", "000.000.000-00"));
		lista.add(new Pessoa("Robinho", "111.111.111-11"));
		lista.add(new Cliente("João", "111.111.111-11", 1518.00f));
		lista.add(new Cliente("Matheus", "111.111.111-11", 1518.00f));
		lista.add(new Funcionario("Nathan", "111.111.111-11", 1518.00f));
		lista.add(new Funcionario("William", "111.111.111-11", 1518.00f));

//		for (Pessoa pessoa : lista) {
//			System.err.println(pessoa.getNome() + " " + pessoa.getClass());
//			if (pessoa instanceof Cliente) {
//				Cliente tmp = (Cliente) pessoa;
//				System.out.println(tmp.getCredito());
//			}
//
//		}
		
		Pessoa p1 = new Pessoa ("Armando", "111");
		Pessoa p2 = new Pessoa ("Armando", "");
		Pessoa f1 = new Funcionario ("Jennifer", "111", 1500f);
		
		if (p1.equals(f1)) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
		System.out.println(lista.toString());
	}
}
