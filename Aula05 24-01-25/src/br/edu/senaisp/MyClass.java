package br.edu.senaisp;

public class MyClass {

//	public static void main(String[] args) {
//
//		int nrLanche = 8;
//
//		switch (nrLanche) {
//		case 1:
//			System.out.println("BigMac");
//			break;
//		case 2:
//			System.out.println("MacChiken");
//			break;
//		case 3:
//			System.out.println("Tasty");
//			break;
//		default:
//			System.out.println("Valor Invalido");
//
//		}
//
//	}

//	public static void main(String[] args) {
//
//		Scanner teclado = new Scanner(System.in);
//
//		System.out.println("digite o número  do seu pedido");
//		int number = teclado.nextInt();
//
//		String diaSemana;
//
//		switch (number) {
//		case 1:
//			diaSemana = "dom";
//			break;
//		case 2:
//			diaSemana = "seg";
//			break;
//		case 3:
//			diaSemana = "ter";
//			break;
//		case 4:
//			diaSemana = "qua";
//			break;
//		case 5:
//			diaSemana = "qui";
//			break;
//		case 6:
//			diaSemana = "sex";
//			break;
//		case 7:
//			diaSemana = "sab";
//			break;
//
//		default:
//			diaSemana = "dado invalido";
//		}
//
//		System.out.println("pedido: " + diaSemana);
//
//	}

//	public static void main(String[] args) {
//
//		String mes = "dezembro";
//
//		switch (mes) {
//		case "janeiro":
//			System.out.println("01");
//			break;
//		case "fevereiro":
//			System.out.println("02");
//			break;
//		case "novembro":
//			System.out.println("11");
//			break;
//		case "dezembro":
//			System.out.println("12");
//		}
//	}

//	public static void main(String[] args) {
//
//		for (int cont = 0; cont < 51; cont = cont + 1) {
//			System.out.println("lógica para a repetição de nome");
//		}
//	}

//	public static void main(String[] args) {
//
//		for (int cont = 0; cont <= 10; cont = cont + 1) {
//			System.out.println("2 x " + cont + " = " + (cont * 2));
//		}
//	}

//	public static void main(String[] args) {
//		int cont = 0;
//
//		while (cont <= 10) {
//			System.out.println("2 x" + cont + "=" + (cont * 2));
//			cont = cont + 1;
//		}
//	}

//	public static void main(String[] args) {
//		boolean desejaContinuar = false;
//		int cont = 0;
//
//		do {
//			System.out.println("Bittencourt");
//			cont = cont + 1;
//			desejaContinuar = (cont < 20);
//		} while (desejaContinuar);
//	}

//	public static void main(String[] args) {
//		if (validaSenha()) {
//			System.out.println("Acesso PERMITIDO");
//		} else {
//			System.out.println("Acesso NEGADO");
//		}
//	}
//
//	public static boolean validaSenha() {
//		Scanner teclado = new Scanner(System.in);
//
//		int senha = 0000;
//		do {
//			System.out.println("Digite sua senha:");
//			senha = teclado.nextInt();
//		} while (senha != 1234);
//		System.out.println("Saiu!");
//		return true;
//	}

//	public static void main(String[] args) {
//		int x = 1;
//		do {
//			System.out.println("Laço DO WHILE");
//			x = x + 1;
//		} while (x < 10);
//	}

//	public static void main(String[] args) {
//		int i = 0;
//		int y = 0;
//
//		while (i < 30) {
//			i++;
//			if (y == 5) {
//				System.out.println("XAXA");
//				y = 0;
//			}
//			y++;
//			System.out.println(i);
//		}
//	}

//	public static void main(String[] args) {
//		int cont = 1;
//		while (cont <= 30) {
//			System.out.println(cont);
//			int resto = (cont % 5);
//			// System.out.println("Resto = " + resto);
//			if (resto == 0) {
//				System.out.println("Xaxa");
//			}
//			cont = cont + 1;
//		}
//	}

//	public static void main(String[] args) {
//		int x = 8;
//
//		while (x <= 42) {
//			int resto = 0;
//			resto = x % 2;
//			if (resto == 0) {
//				System.out.println(" Impares ---> " + x);
//			}
//			x = x + 1;
//		}
//		System.out.println(Math.pow(2, 3));
//	}

	public static void main(String[] args) {

		// Faça um programa de avalie todos os
		// números entre 8 e 42, imprimeindo
		// APENAS os IMPARES;

		for (int x = 8; x <= 42; x++) {
			int resto = (x % 2);
			if (resto == 1) {
				System.out.println(x);
			}
		}
	}
}
