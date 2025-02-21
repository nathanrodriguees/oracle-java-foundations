package br.edu.senaisp.InjecaoDependencia;

public class Teste {

	public static void main(String[] args) {
		Motor m = new Motor();

		Carro c = new Carro(m);
		c.ligarCarro();

		MotorBYD m2 = new MotorBYD();
		Carro c2 = new Carro(m2);
		c2.ligarCarro();
	}
}
