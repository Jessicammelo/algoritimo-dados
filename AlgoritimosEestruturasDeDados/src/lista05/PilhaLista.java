package lista05;

import lista03.ListaEncadeada;
import lista03.NoLista;

public class PilhaLista<T> implements Pilha<T> {

	private ListaEncadeada<T> lista;

	public PilhaLista() {
		lista = new ListaEncadeada<T>();
	}

	@Override
	public void push(T info) {
		lista.inserir(info);
	}

	@Override
	public T pop() {
		T valor;
		valor = peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException();
		}
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {
		while (!estaVazia()) {
			pop();
		}

	}

	public String toString() {
		//return lista.toString();
		String resultado = " ";

		NoLista<T> p = lista.getPrimeiro();
		while (p != null) {
			resultado = resultado + p.getInfo.toString();
			if (p.getProximo() != null) {
				resultado = resultado + ",";
				p = p.getProximo();
			}
		}
		return resultado;
	}

}
