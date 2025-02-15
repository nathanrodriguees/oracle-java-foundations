public class Teste {

	public static void main(String[] args) {

		String cpf = "111.421.694-13";

		cpf = cpf.replace(".", "").replace("-", "");

		char letra;
		int numero;
		int multiplicador = 10;
		int soma = 0;

		for (int i = 0; i < 9; i++) {
			letra = cpf.charAt(i);
			numero = Character.getNumericValue(letra);

			soma = soma + (numero * multiplicador--);
		}
		int resto = soma % 11;
		int dv1 = 11 - resto;
		if (dv1 > 9)
			dv1 = 0;
		int dv1Real = Character.getNumericValue(cpf.charAt(9));

		if (dv1 != dv1Real)
			System.out.println("CPF Invalido");
		else {
			///----------------------------------
			soma = 0;
			multiplicador = 11;
			for (int i = 0; i < 10; i++) {
				letra = cpf.charAt(i);
				numero = Character.getNumericValue(letra);

				soma = soma + (numero * multiplicador--);
			}
			resto = soma % 11;
			int dv2 = 11 - resto;
			if (dv2 > 9)
				dv2 = 0;
			int dv2Real = Character.getNumericValue(cpf.charAt(10));

			if (dv2 != dv2Real)
				System.out.println("CPF Invalido");
			else {
				System.out.println("CPF Válido");
			}

			///----------------------------------
		}

	}

}
