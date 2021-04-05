package lista06;

import lista05.PilhaVaziaException;

public class FilaVetor<T> {

	private T[] info;
	
	private int limite;
	
	private int tamanho;
	
	private int inicio;
	
	public FilaVetor(int limite){
		info = (T[]) new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
		this.inicio = 0;
	}
	
	public void inserir(T valor) {
		if (tamanho == limite) {
			throw new RuntimeException("Fila está cheia");
		}
		int posicaoInserir;
		posicaoInserir = (inicio + tamanho)% limite;
		info[posicaoInserir] = valor;
		tamanho = tamanho + 1;
	}
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	public T peek() {
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		return info[inicio];
	}
	
	public T retirar() {
		T valor = peek();
		inicio = (inicio + 1)% limite;
		tamanho = tamanho -1;
		return valor;
	}
	
	public void liberar() {
		info = (T[]) new Object[limite];
		tamanho = 0;
	}
	
	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
		return f2;
	}
	
	public String toString() {
		return toString();
	}
	
	
}
