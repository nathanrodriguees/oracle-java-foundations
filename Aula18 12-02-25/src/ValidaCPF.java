
public class ValidaCPF {

	public static void main(String[] args) {

		String cpf = "078.973.650-00";

		cpf = cpf.replace(".", "").replace("-", "");

		char[] vetor1 = cpf.toCharArray();
		int[] vetor2 = new int[vetor1.length];

		for (int i = 0; i < vetor1.length; i++) {
//			vetor2[i] = Character.getNumericValue(vetor1[i]);
			vetor2[i] = vetor1[i];
		}

		int soma = 0;
		for (int i = 0; i < 9; i++) {
			soma += vetor2[i] * (10 - i);
		}
		
		System.out.println(soma);

		int resto = soma % 11;

		int dv1 = 11 - resto;

		if (dv1 > 9)
			dv1 = 0;

		if (dv1 != vetor2[9]) {
		    System.out.println("CPF inválido");
		} else {
			
		    int soma2 = 0;
		    for (int i = 0; i < 10; i++) {
		        soma2 += vetor2[i] * (11 - i);
		    }

		    int resto2 = soma2 % 11;
		    int dv2 = 11 - resto2;

		    if (dv2 > 9) {
		        dv2 = 0;
		    }

		    if (dv2 == vetor2[10]) {
		        System.out.println("CPF Válido");
		    } else {
		        System.out.println("CPF Inválido");
		    }
		}

	}

}
