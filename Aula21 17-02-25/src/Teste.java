import java.util.Scanner;

import br.edu.senaiso.dao.AlunoDB;
import br.edu.senaisp.model.Aluno;

public class Teste {

	public static void main(String[] args) {

		Scanner txt = new Scanner(System.in);
		Scanner num = new Scanner(System.in);

		System.err.println("===Cadastro de Alunos===");

		AlunoDB bancoDeDados = new AlunoDB();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do aluno: ");
			String nome = txt.nextLine();

			System.out.println("Digite o CPF do aluno: ");
			String cpf = txt.nextLine();

			bancoDeDados.insert(new Aluno(nome, cpf, null));
		}

		boolean continuar = false;
		do {
			System.out.println("Digite a operação desejada: ");
			System.out.println("- 1. Listar");
			System.out.println("- 2. Inserir");
			System.out.println("- 3. Alterar");
			System.out.println("- 4. Remover");
			int escolha = num.nextInt();

			switch (escolha) {
			case 1:
				for (Aluno aluno : bancoDeDados.selectAll()) {
					System.out.println(aluno);
				}
				break;

			case 2:
				System.out.println("Digite o nome do Aluno:");
				String nomeTmp = txt.nextLine();

				System.out.println("Digite o cpf do Aluno:");
				String cpfTmp = txt.nextLine();

				bancoDeDados.insert(new Aluno(nomeTmp, cpfTmp, null));
				break;

			case 3:
				System.out.println("Digite o NrMatricula do Aluno");
				int matricula = num.nextInt();

				System.out.println("Digite o valor do novo CPF");
				String cpf = txt.nextLine();

				System.out.println("Digite o novo nome do aluno: ");
				String nome = txt.nextLine();

				bancoDeDados.update(new Aluno(nome, cpf, matricula));
				System.out.println("- 3. Alterar");
				break;

			case 4:
				System.out.println("Digite o NrMatricula do Aluno a ser excluido");
				int nrMatricula = num.nextInt();
				bancoDeDados.delete(new Aluno(null, null, nrMatricula));
				break;

			default:
				System.err.println("Escolha inválida");
			}

			System.err.println("Deseja fazer outra operação ? (S/N)");
			String opcao = txt.next();
			continuar = (opcao.toUpperCase().equals("S"));

		} while (continuar);

		// Exercicio 01
//		Sala sala6 = new Sala(6, 20, "Chile");
//		Professor prof = new Professor("Bittencourt", "555.555.555-55", 1023999);
//
//		Turma xaxas = new Turma();
//		xaxas.setId(123);
//		xaxas.setCurso("Java Oracle Foundations");
//		xaxas.setDuracao(80);
//		xaxas.setSala(sala6);
//		xaxas.setProfessor(prof);

//		Modo 1 de Fazer - Criar a lista e depois Get ela para preenchela	
//		xaxas.setAlunos(new ArrayList<Aluno>());
//		xaxas.getAlunos().add(new Aluno("João", "111.111.111-11", 456));
//		xaxas.getAlunos().add(new Aluno("Nathan", "222.222.222-22", 789));
//		xaxas.getAlunos().add(new Aluno("Matheus", "333.333.333-33", 123));

//		Modo 2 de Fazer - Se a classe turma ja tiver criado a lista, só peça-a com o Get e comece a preenche-la
//		xaxas.getAlunos().add(new Aluno("João", "111.111.111-11", 456));
//		xaxas.getAlunos().add(new Aluno("Nathan", "222.222.222-22", 789));
//		xaxas.getAlunos().add(new Aluno("Matheus", "333.333.333-33", 123));

// 		Modo 3 de Fazer - Crie a lista, preencha-a e depois é só SET na Turma
//		ArrayList<Aluno> lista = new ArrayList<Aluno>();
//		lista.add(new Aluno("João", "123", 456));
//		xaxas.setAlunos(lista);

//		for (Aluno aluno : xaxas.getAlunos()) {
//			System.out.println(aluno.getNome());
//		}
//	
//		System.out.println(xaxas.getCurso());
//		System.out.println(xaxas.getProfessor().getNome());

	}

}
