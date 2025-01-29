import java.util.Scanner;


// Escreve um programa que verifique se uma pessoa é maior de idade (18 anos ou mais)
// e se ela é elegível para votar (idade entre 16 e 70 anos).
public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade < 18 && idade >= 16) {
			System.out.println("Menor de idade");
			System.out.println("Pode votar");
		}else {
			if (idade < 16) {
				System.out.println("Menor de idade");
				System.out.println("Não pode votar");
			}else {
				if(idade >=18 && idade <= 70){
					System.out.println("Maior de idade");
					System.out.println("Pode votar");
				}else {
					System.out.println("Maior de idade");
					System.out.println("Não pode votar");
				}
			}
		}

	}
}
