package lista06;

import lista03.ListaEncadeada;
import lista03.NoLista;

public class FilaLista<T> implements Fila<T> {

	private ListaEncadeada<T> lista;
	
	private NoLista<T> lista2;
	
	public void inserirNoFinal(T valor) {
		
	}

	@Override
	public void inserir(T valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T retirar() {
		T valor = peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		
	}
}
