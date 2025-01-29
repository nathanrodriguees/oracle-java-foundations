package br.edu.senaisp;

import java.util.Scanner;

public class Triangulo {

//	public static void main(String[] args) {
//
////	Exercício do triangulo:
//		Scanner xaxa = new Scanner(System.in);
//
//		int lados[] = new int[3];
//		String triangulo = "";
//
//		for (int i = 0; i < 3; i++) {
//			lados[i] = xaxa.nextInt();
//		}
//
//		boolean equilatero = lados[0] == lados[1] && lados[1] == lados[2];
//		boolean isosceles = lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2];
//
//		if (equilatero) {
//			triangulo = "Equilátero";
//		} else if (isosceles) {
//			triangulo = "Isósceles";
//		} else {
//			triangulo = "Escaleno";
//		}
//		System.out.println("O triângulo é do tipo " + triangulo);
//
//	}

	public static void main(String[] args) {

//		Exercício do triangulo: Bittencourt

		int l1 = 6;
		int l2 = 6;
		int l3 = 6;

		if (l1 == l2 && l2 == l3) {
			System.out.println("Equilátero!");
		} else if (l1 != l2 && l2 != l3 && l1 != l3) {
			System.out.println("Escaleno!");
		} else {
			System.out.println("Isosceles!");
		}

	}
}
