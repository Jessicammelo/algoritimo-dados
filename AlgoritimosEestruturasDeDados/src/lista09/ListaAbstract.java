package lista09;

public abstract class ListaAbstract<T> {

	private T[] info;
	private int tamanho;
	private final byte TAMANHO_INICIAL = 10;

	public ListaAbstract() {
		info = (T[]) new Object[TAMANHO_INICIAL];
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	protected void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	protected void redimensionar() {
		T[] novo = (T[]) new Object[tamanho + 10];
		for (int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}

	public int getLimite() {
		return info.length;
	}

	public abstract void inserir(T dado);

	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i]);
		}
	}

	public abstract int buscar(T dado);

	public void retirar(T dado) {
		int posicao = buscar(dado);
		if (posicao > -1) {
			for (int i = posicao; i < tamanho - 1; i++) {
				info[i] = info[i + 1];
			}
			info[tamanho - 1] = null;
			tamanho--;
		}
	}

	public void liberar() {
		info = (T[]) new Object[TAMANHO_INICIAL];
		;
		tamanho = 0;
	}

	public T obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < tamanho)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public boolean estaVazia() {
		return tamanho == 0;
	}

	public String toString() {
		String resultado = "";
		for (int i = 0; i < tamanho; i++) {
			if (i > 0)
				resultado += ",";
			resultado += info[i];
		}
		return resultado;
	}

	// public void inverter() {
	// for (int i = 0; i < tamanho / 2; i++) {
	// ClasseParametrizada p = info[i];
	// info[i] = info[tamanho - i - 1];
	// info[tamanho - i - 1] = p;
	// }
	// }

	// metodo inverter que o professor fez
	public void inverter() {
		int esquerda = 0;
		int direita = tamanho - 1;
		int meio = tamanho / 2;

		T backup;

		while (esquerda < meio) {
			backup = info[esquerda];
			info[esquerda] = info[direita];
			info[direita] = backup;
			esquerda++;
			direita++;
		}
	}

	public T[] getInfo() {
		return info;
	}

	private void setInfo(T[] info) {
		this.info = info;
	}

}
