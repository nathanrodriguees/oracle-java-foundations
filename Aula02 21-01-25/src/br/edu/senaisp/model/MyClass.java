package br.edu.senaisp.model;

public class MyClass {

	public static void main(String[] args) {
		
//		int idade = 17;
//		
//		boolean ehMaior = (idade >= 18);
//		
//		if( ehMaior) {
//			System.out.println("Maior de idade");
//		}else{
//			System.out.println("Menor de idade");
//		}
	     
//		String mensagem = idade < 18
//				? "Menor de idade"
//				: "Maior de idade";
//		
//		System.out.println(mensagem);
		
		int idade = 11;

		String mensagem = idade < 12 
		        ? "Criança" 
		        : idade < 18 
		            ? "Adolescente" 
		            : "Adulto";

		System.out.println(mensagem);
	}
}
