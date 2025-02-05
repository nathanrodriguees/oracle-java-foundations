
public class Lista {

	String[] vetor = new String[10];
	int posicaoVaga = 0;

	public void adicionar(String valor) {
		vetor[posicaoVaga] = valor;
		posicaoVaga++;
	}

	public void mostrarTodos() {
		for (String valor : vetor) {
			System.out.println(valor);
		}
	}

	public int buscar(String valor) {
		int indice = 0;

		for (String info : vetor) {

			if (info != null) {
				if (info.equals(valor)) {
					return indice;
				}
			} else {
				break;
			}
			indice++;
		}
		return -1;
	}

	public void remover(int pos) {
		for (int i = pos; i < posicaoVaga; i++) {
			vetor[i] = vetor[i+1];
			vetor[posicaoVaga] = null;
		}
		posicaoVaga--;
	}
	
	public String buscarPorIndice(int valor) {
		if (valor < posicaoVaga) {
			return vetor[valor];
		}else {
			return null;
		}
		
	}

}
