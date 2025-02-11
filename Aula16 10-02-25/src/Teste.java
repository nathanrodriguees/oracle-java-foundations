import br.edu.senaisp.model.Cachorro;

public class Teste {

	public static void main(String[] args) {

		Cachorro cao1 = new Cachorro("Bolt", "Pug", "Marrom");

		System.out.println(cao1.Correr());
		System.out.println(cao1.Latir());

		Cachorro cao2 = new Cachorro("Spike", "Golden", "Caramelo");

		System.out.println(cao2.Correr());
		System.out.println(cao2.Latir());

		Cachorro cao3 = new Cachorro("Jhon Wick", "Hasky", "Cinza");

		System.out.println(cao3.Correr());
		System.out.println(cao3.Latir());

	}
}
