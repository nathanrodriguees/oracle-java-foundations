import java.util.ArrayList;
import java.util.Collections;

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
		
		Collections.sort(flores); // Ordena os elementos da lista
		
		for (String flor : flores) {
			System.out.println(flor);
		}
		
		System.out.println(flores.toString());
		
		System.out.println(flores.contains("Lotus"));
		
		System.err.println(flores.get(0));
		
		System.out.println(flores.indexOf("Jasmin")); // busca o índice do elemento, se não for encontrado na lista, ele retorna -1.
		
		System.err.println(flores.isEmpty());
		
		System.out.println(flores.remove(2)); // remove o elemento que está na posição de índice
		
		
	}
}
