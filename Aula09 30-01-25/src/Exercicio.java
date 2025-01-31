// Exercicio: 
// 1. Gere um vetor de String com 3 posições
// 2. Escolha 3 colegas e em cada posição do vetor registre-os;
// Conforme exemplo: "Nome";"Altura";"Idade" e "Cidade"
// 3. Gere mais 4 vetores String com os respectivos nomes: nome[], altura[], idade[], ciade[]
// 4. Utilizando a função split da classe String separe as informações conforme os vetores corretos

public class Exercicio {

	public static void main(String[] args) {

		// 1. Gere um vetor de String com 3 posições
		String[] aluno = new String[3];

		// 2. Escolha 3 colegas e em cada posição do vetor registre-os;
		aluno[0] = "João;1.78;19;São Paulo";
		aluno[1] = "Matheus;1.90;22;São Paulo";
		aluno[2] = "Nathan;1.81;24;São Paulo";
		
		String[] nome = new String[3];
		String[] altura = new String[3];
		String[] idade = new String[3];
		String[] cidade = new String[3];
		
		for (int i = 0; i < aluno.length; i++) {
			String[] vetor = aluno[i].split(";");
			
			nome[i] = vetor[0];
			altura[i] = vetor[1];
			idade[i] = vetor[2];
			cidade[i] = vetor[3];
			
			System.out.print(nome[i] + "; ");
			System.out.print(altura[i] + "; ");
			System.out.print(idade[i] + "; ");
			System.out.print(cidade[i] + "; ");
			System.out.println();
			
		}

	}

}
