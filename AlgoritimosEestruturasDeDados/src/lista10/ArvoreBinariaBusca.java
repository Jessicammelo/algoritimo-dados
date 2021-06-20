package lista10;

import lista07.NoArvoreBinaria;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

	public void inserir(T info) {
		NoArvoreBinaria<T> novo = new NoArvoreBinaria<>(info);
		if (estaVazia()) {
			setRaiz(novo);
		}else {
			NoArvoreBinaria<T> p = getRaiz();
			NoArvoreBinaria<T> pai;
			while (true) {
				pai = p;
				if ( info.compareTo(p.getInfo()) < 0) {
					p = p.getEsquerda();
					if ( p == null) {
						pai.setEsquerda(novo);
						return;
				}
			}else {
				p = p.getDireita();
				if (p == null) {
					pai.setDireita(novo);
					return;
				}
			}
		}
	}
}

	public NoArvoreBinaria<T> buscar(T buscar) {
		return buscar(buscar);
	}

	private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> excluir) {
		return excluir;
	}

	public void retirar(T info) {
		
		NoArvoreBinaria<T> p =getRaiz();
		NoArvoreBinaria<T> pai = null;
		boolean filhoEsquerda = false;
	}

}
