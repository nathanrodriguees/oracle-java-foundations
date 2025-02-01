// Exercicio: 
// 1. Gere um vetor de String com 3 posições
// 2. Escolha 3 colegas e em cada posição do vetor registre-os;
// Conforme exemplo: "Nome";"Altura";"Idade" e "Cidade"
// 3. Gere mais 4 vetores String com os respectivos nomes: nome[], altura[], idade[], ciade[]
// 4. Utilizando a função split da classe String separe as informações conforme os vetores corretos

public class Cadastro {

	public static void main(String[] args) {

		// 1. Gere um vetor de String com 3 posições
		String[] alunos = new String[3];

		// 2. Escolha 3 colegas e em cada posição do vetor registre-os;
		alunos[0] = "João;1.78;19;São Paulo";
		alunos[1] = "Matheus;1.90;22;São Paulo";
		alunos[2] = "Nathan;1.81;24;São Paulo";

		// 3. Gere mais 4 vetores String com os respectivos nomes:
		// nome[], altura[], idade[], cidade[]
		String[] nome = new String[3];
		String[] altura = new String[3];
		String[] idade = new String[3];
		String[] cidade = new String[3];

		// 4. Utilizando a função split da classe String separe as
		// informações conforme os vetores corretos
		for (int i = 0; i < alunos.length; i++) {

			String[] vetor = alunos[i].split(";");

			nome[i] = vetor[0];
			altura[i] = vetor[1];
			idade[i] = vetor[2];
			cidade[i] = vetor[3];

			System.out.print(nome[i] + "; ");
			System.out.print(altura[i] + "; ");
			System.out.print(idade[i] + "; ");
			System.out.print(cidade[i] + "; ");
			System.out.println("\n");
		}

		float media = mediaAltura(altura);
		System.out.printf("Media da Altura: = %.2f", media);
	}

	// Metodo para calcular a media da altura dos alunos
	public static float mediaAltura(String[] altura) {
		float somatorio = 0;

		for (int i = 0; i < altura.length; i++) {
			float temp = Float.parseFloat(altura[i]);
			somatorio += temp;
		}
		return somatorio / altura.length;
	}

}
