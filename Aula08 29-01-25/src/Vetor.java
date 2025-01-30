import java.util.Scanner;

public class Vetor {
	
	// Introdução a vetores
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int[] idades = new int [10];
//		idades[0] = 15;
//		System.out.println(idades[0]);
//
//		String[] alunos = new String[5];
//
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println("Digite o " + (i + 1) + "° nome: ");
//			alunos[i] = sc.next();
//		}
//
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println(alunos[i]);
//		}
//
//	}
	
	// Faça um programa que leia 5 numeros inteiros
	// Imprima a soma de todos os numeros
	// Imprima a media de todos os numeros
	// Imprima o maior numero
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] numbers = new int[5];
		int soma = 0;
		int maior = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° numero: ");
			numbers[i] = sc.nextInt();
			soma = soma + numbers[i];
			
			
			if (maior >= numbers[i]) {
				maior = maior;
			}else {
				maior = numbers[i];
			}
		}
		

		float media = soma / 2f;
		
		System.out.println("A soma de todos os números é: " + soma);
		System.out.println("A media de todos os números é: " + media);
		System.out.println("O maior número é: " + maior);
		
	}
}
