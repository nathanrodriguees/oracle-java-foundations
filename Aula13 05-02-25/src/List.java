
public class List {
	
	String[] vetor = new String[5];
	int posicaoVaga = 0;

	public void adicionar(String valor) {
		if (vetor.length <= posicaoVaga) {
			String[] vetTemp = new String[vetor.length + 5];
			
			int i = 0;
			for (String conteudo : vetor) {
				vetTemp[i] = conteudo;
				i++;
			}
			vetor = vetTemp;
		}
		
		vetor[posicaoVaga] = valor;
		posicaoVaga++;
	}

	public String mostrarTodos() {
		StringBuffer temp = new StringBuffer();
		
		for (String valor : vetor) {
			temp.append(valor).append(";");
		}
		return temp.toString();
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
