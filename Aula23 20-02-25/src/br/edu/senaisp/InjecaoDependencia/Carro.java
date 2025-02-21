package br.edu.senaisp.InjecaoDependencia;

public class Carro {
//	private Motor motor;
//
//	public Carro(Motor motor) {
//		this.motor = motor;
//	}

	private IMotor motor;

	public Carro(IMotor motor) {
		this.motor = motor;
	}

	public void ligarCarro() {
		motor.ligar();
		System.out.println("Carro Ligado");
	}

}
