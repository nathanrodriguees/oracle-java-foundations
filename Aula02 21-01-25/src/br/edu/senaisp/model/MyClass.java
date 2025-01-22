package br.edu.senaisp.model;
import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		int idade = 17;
//		
//		boolean ehMaior = (idade >= 18);
//		
//		if( ehMaior) {
//			System.out.println("Maior de idade");
//		}else{
//			System.out.println("Menor de idade");
//		}
		
		
//		// Faça um programa que receba 2 valores e escreva o maior deles.
// 		Scanner
//		System.out.printf("Digite o 1° número:");
//		int n1 = sc.nextInt();
//		
//		System.out.printf("Digite o 2° número:");
//		int n2 = sc.nextInt();
//		
//		if (n1 > n2) {
//			System.out.printf("%d é maior\n", n1);
//			System.out.println(String.format("%d é maior", n1));
//		}else {
//			if (n1 == n2) {
//				System.out.println(n1 + " e " + n2 + " são iguais");
//			}else {
//				System.out.printf("%d é maior\n", n2);
//				System.out.println(String.format("%d é maior", n2));
//			}
//		}
		
		
// 		Validador de senha
		System.out.printf("Digite a senha:");
		int senha = sc.nextInt();
		
//		if (senha == 1234) {
//			System.out.printf("ACESSO PERMITIDO");
//		}else {
//			System.out.printf("ACESSO NEGADO");
//		}
		
		System.out.println(senha == 1234
				? "ACESSO PERMITIDO"
				: "ACESSO NEGADO");
		
		
//		Operadores ternários
//		String mensagem = idade < 18
//				? "Menor de idade"
//				: "Maior de idade";
//		
//		System.out.println(mensagem);
//		
//		int idade = 11;
//
//		String mensagem = idade < 12 
//		        ? "Criança" 
//		        : idade < 18 
//		            ? "Adolescente" 
//		            : "Adulto";
//
//		System.out.println(mensagem);
	}
}
