package lista10;

import lista07.NoArvoreBinaria;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

	protected void setRaiz(NoArvoreBinaria<T> raiz) {
		super.setRaiz(raiz);
	}

	public NoArvoreBinaria<T> buscar(T info) {
		return buscar(getRaiz(), info);
	}

	private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
		if (no == null) {
			return null;
		} else {
			if (no.getInfo().equals(info)) {
				return no;
			} else {
				NoArvoreBinaria<T> aux;
				aux = buscar(no.getEsquerda(), info);
				if (aux == null) {
					aux = buscar(no.getDireita(), info);
				}
				return aux;
			}
		}
	}

}
