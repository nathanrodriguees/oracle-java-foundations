
public class Teste {

	public static void main(String[] args) {

		Lista animais = new Lista();
		animais.adicionar("Unicornio");
		animais.adicionar("Leleleão Marinho");
		animais.adicionar("Pombo");
		
//		int posicao = animais.buscar("teste");
//		System.out.println(posicao);
		
		animais.remover(2);
		animais.mostrarTodos();
		animais.adicionar("Prea");
		animais.remover(0);
		animais.mostrarTodos();
		
		Lista plantas = new Lista();
		plantas.adicionar("Samambaia");
		
		Lista carros = new Lista();
		carros.adicionar("Mustang");
		carros.adicionar("Marea");
 
	}
}
