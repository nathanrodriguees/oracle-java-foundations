package br.edu.senaisp.interfaces;

public class Quadrado implements IFiguraGeo {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcArea() {
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}