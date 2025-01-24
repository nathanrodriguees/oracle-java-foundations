package br.edu.senaisp;

import java.util.Scanner;

//public class MyClass {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Digite sua senha: ");
//		int senha = sc.nextInt();
//		
//		System.out.println(validaSenha(senha) 
//							? "ACESSO PERMITIDO" 
//							: "ACESSO NEGADO");
//		
//		if (validaSenha(senha)) {
//			System.out.println("ACESSO PERMITIDO");
//		}else {
//			System.out.println("ACESSO NEGADO");
//		}
//	}
//	
//	public static boolean validaSenha(int s) {
//		return s == 1234;
//	}
//}

// Exercicio
//public class MyClass {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int nrDiaDaSemana = 8;
//
//		if (nrDiaDaSemana == 1) {
//			System.out.println("Domingo");
//		} else {
//			if (nrDiaDaSemana == 2) {
//				System.out.println("Segunda");
//			} else {
//				if (nrDiaDaSemana == 3) {
//					System.out.println("Terça");
//				} else {
//					if (nrDiaDaSemana == 4) {
//						System.out.println("Quarta");
//					} else {
//						if (nrDiaDaSemana == 5) {
//							System.out.println("Quinta");
//						} else {
//							if (nrDiaDaSemana == 6) {
//								System.out.println("Sexta");
//							} else {
//								if (nrDiaDaSemana == 7) {
//									System.out.println("Sabádo");
//								} else {
//									System.out.println("Valor inválido");
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//	}
//}

//Exercicio
public class MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do lanche: ");
		int lanche = sc.nextInt();

		if(lanche == 1) {
			System.out.println("Big Mac");
		}else {
			if(lanche == 2) {
				System.out.println("McChicken");
			}else {
				if(lanche == 3) {
					System.out.println("Tasty");
				}else {
					System.out.println("Não tem esse lanche");
				}
			}
		}
	}
}
