import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {

//		String[] flores = new String[10];
		
		// Introdução a Lista
		ArrayList<String> flores = new ArrayList<>();
		flores.add("Margarida");
		flores.add("Rosa");
		flores.add("Tulipa");
		flores.add("Violeta");
		flores.add("Orquidea");
		flores.add("Lirius");
		flores.add("Girassol");
		flores.add("Cravo");
		flores.add("Crisantemo");
		flores.add("Jasmin");
		flores.add("Hortencia");
		flores.add("Bromelia");
		
		for (String flor : flores) {
			System.out.println(flor);
		}
		
		System.out.println(flores.toString());
		
		//Exercicio: Criar lista com o nome de 3 pessoas e imprimir
		
		
	}
}
