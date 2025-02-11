package br.edu.senaisp.empresa;

import br.edu.senaisp.empresa.model.Cliente;
import br.edu.senaisp.empresa.model.Funcionario;

public class Teste {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Cleiton","000.000.000-00", 1518.00f);
		Cliente c1 = new Cliente("Robinho","111.111.111-11", 2000.00f);
		
		System.out.println(c1.getNome());
		System.out.println(f1.getNome());
	}
}
