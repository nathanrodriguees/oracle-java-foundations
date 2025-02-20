package br.edu.senaisp.interfaces;

public class Teste {

	public static void main(String[] args) {

		Quadrado q = new Quadrado(7);
		System.out.println(q.calcArea());

		Circulo c = new Circulo(10);
		System.out.println(c.calcArea());
	}
}
