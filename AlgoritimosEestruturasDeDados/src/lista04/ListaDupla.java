package lista04;

import lista03.NoLista;

public class ListaDupla<T> {

	private NoListaDupla<T> primeiro;

	public ListaDupla() {
		primeiro = null;
	}

	public NoListaDupla<T> getPrimeiro() {
		return this.primeiro;
	}

	public void inserir(T valor) {
		NoListaDupla<T> novo = new NoListaDupla();
		novo.getInfo = valor;
		novo.setProximo(primeiro);
		this.primeiro = novo;
	}

	public NoListaDupla<T> buscar(T valor) {
		NoListaDupla<T> p = this.primeiro;
		while (p != null) {
			if (p.getInfo.equals(valor)) {
				return p;
			}
			p = p.getProximo();
		}
		return null;

	}

	public void retirar(T valor) {
		NoListaDupla<T> anterior = null;
		NoListaDupla<T> p = primeiro;

		while ((p != null) && (!p.getInfo.equals(valor))) {
			anterior = p;
			p = p.getProximo();
		}
		if (p != null) {
			if (p == primeiro)
				primeiro = primeiro.getProximo();
		} else {
			anterior.setProximo(p.getProximo());
		}
	}

	public void exibirOrdemInversa() {
		NoListaDupla<T> percorrer = null;
		while (percorrer.getProximo() != null) {
			percorrer = percorrer.getProximo();
		}
		while ( percorrer.getAnterior() != null) {
			percorrer.toString();
			percorrer = percorrer.getAnterior();			
		}
	}

	public void liberar() {
		NoListaDupla<T> liberar = this.primeiro;
		
		while (liberar.getProximo() != null) {
			NoListaDupla<T> primeiro = liberar;
			liberar = liberar.getProximo();
			primeiro.setProximo(null);
		}
		while (liberar.getAnterior() != null) {
			NoListaDupla<T> anterior = liberar;
			liberar = liberar.getAnterior();
			anterior.setAnterior(null);
			
		}
		
	}

	public String toString() {
		String resultado = " ";
		NoListaDupla<T> p = primeiro;

		while (p != null) {

			if (p != primeiro) {
				resultado += ",";
			}
			resultado += p.getInfo.toString();
			p = p.getProximo();
		}
		return resultado;
	}

}
