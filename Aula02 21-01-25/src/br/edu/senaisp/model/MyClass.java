package br.edu.senaisp.model;

public class MyClass {

	public static void main(String[] args) {
		
		int idade = 19;
		
//		if( idade >= 18) {
//			System.out.println("Maior de idade");
//		}else{
//			System.out.println("Menor de idade");
//		}
	     
		String mensagem = idade < 18
				? "Menor de idade"
				: "Maior de idade";
		System.out.println(mensagem);
	}
}
