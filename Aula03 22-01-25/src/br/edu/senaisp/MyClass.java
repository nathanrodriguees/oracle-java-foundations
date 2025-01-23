package br.edu.senaisp;

import java.util.*;

public class MyClass {

	// Sub-Algoritmos
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num1 = 10;
//		int num2 = 20;
//		int soma = soma(num1, num2);
//		int subtracao = subtracao(num1, num2);
//		
//		System.out.println("A soma é = " + soma);
//		System.out.println("A subtração é = " + subtracao);
		
		// Exercico
		System.out.println("Digite a quantidade de maçã: ");
		int qtd = sc.nextInt();
		
		float preco = valor(qtd); 
		
		// Imprimindo decidindo o número de casas decimais
		System.out.printf("Você irá pagar = %.3f", preco);
	}
	
	public static float valor(float q) {
		if(q < 12) {
			return q * 0.30f;
		}else {
			return q * 0.25f;
		}
//		
//		return (quantidade < 12 ? (quantidade * 0.30f) : (quantidade * 0.25f));
	}
	
//	public static int soma (int a, int b){
//		return a + b;	
//	}
//	
//	public static int subtracao (int a, int b){
//		
//		if (a > b) {
//			return a - b;
//		}else {
//			return b - a;
//		}
//		
//		return (a > b ? (a - b) : (b - a) );		
//	}
	
	
}