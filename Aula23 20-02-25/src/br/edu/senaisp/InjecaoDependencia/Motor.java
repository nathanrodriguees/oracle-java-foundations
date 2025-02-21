package br.edu.senaisp.InjecaoDependencia;

public class Motor implements IMotor{

	@Override
	public void ligar() {
		System.out.println("Ligou");
	}

}
