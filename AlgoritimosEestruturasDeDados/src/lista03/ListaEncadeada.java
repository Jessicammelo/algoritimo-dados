package lista03;

public class ListaEncadeada<T> {

	private NoLista primeiro;

	public ListaEncadeada() {
		primeiro = null;
	}

	public NoLista<T> getPrimeiro() {
		return this.primeiro;
	}

	public void inserir(T info) {
		NoLista<T> novo = new NoLista();
		novo.getInfo = info;
		novo.setProximo(primeiro);
		this.primeiro = novo;
	}

	public boolean estaVazia() {
		return this.primeiro == null;

	}

	public NoLista<T> buscar(T valor) {
		NoLista<T> p = this.primeiro;
		while (p != null) {
			if (p.getInfo.equals(valor)) {
				return p;
			}
			p = p.getProximo();
		}
		return null;

	}

	public void retirar(T valor) {
		NoLista<T> anterior = null;
		NoLista<T> p = primeiro;

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

	public int obterComprimento() {
		int qtdDeNos = 0;

		NoLista<T> p = primeiro;

		while (p != primeiro) {
			qtdDeNos++;
			p = p.getProximo();
		}
		return qtdDeNos;
	}

	public NoLista<T> obterNo(int idx) {
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}
		NoLista<T> p = getPrimeiro();
		while ((p != null) && (idx > 0)) {
			idx--;
			p = p.getProximo();
		}

		if (p == null) {
			throw new IndexOutOfBoundsException();
		}
		return p;
	}

	public String toString() {
		String resultado = " ";
		NoLista<T> p = primeiro;
		
		while (p != null) {
			
			if ( p != primeiro) {
				resultado += ",";
			}
			resultado += p.getInfo.toString();
			p = p.getProximo();
		}
		return resultado;
	}
}
