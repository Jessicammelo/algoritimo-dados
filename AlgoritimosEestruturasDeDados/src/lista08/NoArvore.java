package lista08;

public class NoArvore<T> {

	private T info;
	private NoArvore<T> primeiro;
	private NoArvore<T> proximo;
	
	public  NoArvore(T info) {
		this.info = info;
		primeiro = null;
		proximo = null;
	}
	
	public void inserirFilhos(NoArvore<T> sa) {
		sa.setProximo(this.primeiro);
		this.setPrimeiro(sa);
	}
	
	public T getInfo() {
		return info;
	}

	private void setInfo(T info) {
		this.info = info;
	}

	private void setPrimeiro(NoArvore<T> primeiro) {
		this.primeiro = primeiro;
	}

	private void setProximo(NoArvore<T> proximo) {
		this.proximo = proximo;
	}

	public NoArvore<T> getPrimeiro(){
		return getPrimeiro();
	}
	
	public NoArvore<T> getProximo(){
		return getProximo();
	}
}
