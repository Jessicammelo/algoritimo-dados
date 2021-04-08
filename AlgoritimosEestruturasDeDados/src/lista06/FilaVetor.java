package lista06;

import lista05.PilhaVaziaException;

public class FilaVetor<T> implements Fila<T> {

	private T[] info;
	
	private int limite;
	
	private int tamanho;
	
	private int inicio;
	
	// construtor
	public FilaVetor(int limite){
		info = (T[]) new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
		this.inicio = 0;
	}
	
	public int getLimite() {
		return limite;
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
		FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);
		int indice;
		
		indice = this.inicio;
		for ( int i = 0; i < this.tamanho;i++) {
			f3.inserir(this.info[indice]);
			indice = (indice + 1) % this.limite;
		}
		indice = f2.inicio;
		for ( int i = 0; i < f2.tamanho;i++) {
			f3.inserir(f2.info[indice]);
			indice = (indice + 1) % f2.limite;
		}
		return f3;
	}
	
	public String toString() {
		String retorno = "";
		
		int indice = inicio;
		for ( int i = 0; i< tamanho ; i++) {
			if (i>0) {
				return  ",";
			}
			retorno = retorno + info[indice];
			
		}
		return toString();
	}
	
	
}
