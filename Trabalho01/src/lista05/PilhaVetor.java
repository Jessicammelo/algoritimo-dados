package lista05;

public class PilhaVetor<T> implements Pilha<T> {

	private T[] info;

	private int limite;

	private int tamanho;

	// cria uma pilha com o tamanho especificado
	public PilhaVetor(int tam) {
		info = (T[]) new Object[tam];
		this.limite = tam;
		this.tamanho = 0;
	}

	// empilha um dado
	public void push(T info) {
		if (tamanho == limite)
			throw new PilhaCheiaException();
		else {
			this.info[tamanho] = info;
			tamanho++;
		}

	}

	// retirar um dado da pilha e devolver o dado removido
	public T pop() {
		T valor = peek();
		info[tamanho - 1] = null;
		tamanho--;
		return valor;
	}

	public T peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException();
		}
		return info[tamanho - 1];

	}

	public boolean estaVazia() {
		return (tamanho == 0);
	}

	// desempilha todos os dados da pilha
	public void liberar() {
		info = (T[]) new Object[limite];
		tamanho = 0;

	}

	// 2 possibilidade o peek chama o esta vazia
	// while ( !estaVazia()){
	// pop();

	// 3 possibilidade
	// try {
	// while (true) {
	// pop();
	// }
	// } cath (PilhaVaziaException e ){
	// }

	public String toString() {
		String resultado = "";

		for (int i = tamanho - 1; i >= 0; i--) {
			resultado += info[i];
			if (i > 0) {
				resultado = resultado + ",";
			}
		}
		return resultado;
	}
	//concatena a pila corrente com outra pilha
	public void concatenar(PilhaVetor<T> p) {
		for (int i=0; i<p.tamanho; i++) {
			this.push(p.info[i]);
		}

	}
}
