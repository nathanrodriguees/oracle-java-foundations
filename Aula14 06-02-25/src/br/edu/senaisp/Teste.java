package br.edu.senaisp;

import br.edu.senaisp.model.Carro;

public class Teste {

	public static void main(String[] args) {

		Carro c1 = new Carro("Fusca", "Volkswagen", 1_000_000, "Azul Bebê", "EPG0X12", "Armando Peixoto");
//		c1.nome = "Fusca";
//		c1.marca = "Volkswagen";
//		c1.cor = "Azul Bebê";
//		c1.km = 1_000_000;
//		c1.placa = "EPG0X12";
//		c1.nomeCliente = "Armando Peixoto";
		
		c1.setNome("Fufu");

		System.out.println(c1.getNome());

	}
}