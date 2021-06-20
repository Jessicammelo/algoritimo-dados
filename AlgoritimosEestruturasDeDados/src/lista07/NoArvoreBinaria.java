package lista07;

public class NoArvoreBinaria<T> {

	private T info;

	private NoArvoreBinaria<T> esquerda;
	private NoArvoreBinaria<T> direita;

	public NoArvoreBinaria(T info) {
		this.info = info;
		this.direita = null;
		this.esquerda = null;
	}

	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
	}

	public void setInfo(T info) {

	}

	public T getInfo() {
		return info;
	}

	public NoArvoreBinaria<T> getEsquerda() {
		return getEsquerda();
	}

	public NoArvoreBinaria<T> getDireita() {
		return getEsquerda();
	}

	public void setEsquerda(NoArvoreBinaria<T> esquerda) {

	}

	public void setDireita(NoArvoreBinaria<T> direita) {

	}

}
