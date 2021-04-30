package lista02;

public class ListaEstatica <ClasseParametrizada> {

	private ClasseParametrizada[] info;
	private int tamanho;
	
	@SuppressWarnings("unchecked")
	public ListaEstatica() {	
		info = (ClasseParametrizada[]) new Object[10];
		tamanho = 0;
	}
	
	private void redimensionar() {
		ClasseParametrizada novo[];
		int novoTamanho = info.length + 10;
		novo = (ClasseParametrizada[]) new Object[novoTamanho];
		for (int i = 0; i < tamanho - 1; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	public void inserir(ClasseParametrizada valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i]);
		}
	}
	
	public int buscar(ClasseParametrizada valor) {
		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
			
	}
	
	public void retirar(ClasseParametrizada valor) {
		int posicao = buscar(valor);
		if (posicao > -1) {
			for (int i = posicao; i < tamanho - 1; i++) {
				info[i] = info[i + 1];
			}
			tamanho--;
		}
	}
	
	public void liberar() {
		info = (ClasseParametrizada[]) new Object[10];;
		tamanho = 0;
	}
	
	public ClasseParametrizada obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < tamanho)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public String toString() {
		String resultado = "";
		for ( int i = 0; i< tamanho; i++) {
			if ( i>0)
				resultado += ",";
			resultado += info [i];
		}
		return resultado;
	}
	
	//public void inverter() {
		//for (int i = 0; i < tamanho / 2; i++) {
			//ClasseParametrizada p = info[i];
			//info[i] = info[tamanho - i - 1];
			//info[tamanho - i - 1] = p;
		//}
	//}
 
	// metodo inverter que o professor fez
	public void inverter() {
		int esquerda = 0;
		int direita = tamanho-1;
		int meio = tamanho / 2;
		
		ClasseParametrizada backup;
		
		while (esquerda < meio) {
			backup = info [esquerda];
			info [esquerda ] = info [direita];
			info [direita] = backup;
			 esquerda++;
			 direita++;
		}
	}
	
	
}
