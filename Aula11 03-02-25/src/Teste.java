import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		ArrayList<String> flores = new ArrayList<>();
		flores.add("Margarida");
		flores.add("Rosa");
		flores.add("Tulipa");
		flores.add("Violeta");
		flores.add("Orquidea");
		flores.add("Lirius");
		flores.add("Girasol");
		flores.add("Gravo");
		flores.add("Crisantemo");
		flores.add("Jasmin");
		flores.add("Papoula");
		flores.add("Lotus");
		flores.add("Ortencia");
		flores.add("Bromelia");

		ArrayList<String> plantas = new ArrayList<>();
		plantas.add("Comigo Ninguém Pode");
		plantas.add("Samambaia");
		plantas.add("Cactos");
		flores.addAll(plantas);

		ArrayList<String> arvores = new ArrayList<>();
		arvores.add("Silveira");
		arvores.add("Pereira");
		System.err.println(flores.containsAll(arvores));

		flores.removeAll(plantas);

		System.out.println(flores.size());

		// flores.clear();

		List<String> novaFlores = flores.reversed();

		int i = 1;
		for (String flor : novaFlores) {
			System.out.println(i + "-" + flor);
			i++;
		}
		
		
		// Lista Imutavel

		 List<String> caes = List.of("Golden", "Caramelho",
					"Xaxau", "Lalau");
		caes.remove("Golden");
		 for (String string : caes) {
			System.err.println(string);
		}

	}
}
