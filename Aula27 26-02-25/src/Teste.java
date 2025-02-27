import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1º Nr: ");
		int a = sc.nextInt();
		System.out.println("Digite o 2º Nr: ");
		int b = sc.nextInt();
		double resultado = 0;

		// Tratando o erro
		try {
			resultado = dividir(a, b);
		} catch (Exception e) {
			System.out.println(e.getMessage() + "Erro");
		}

		System.out.println(resultado);

	}

	// Camada intermediaria
	public static double calculeira(int a, int b) throws Exception {
		return dividir(a, b);
	}

	// Camada para lançar o erro
	public static double dividir(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("Não pode dividir por zero");

		return a / b;
	}
}
