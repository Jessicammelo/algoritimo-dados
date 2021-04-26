package lista03;

public class NoLista <T>{

	private T info;
	
	public T getInfo;
	
	private NoLista proximo;
	
	public void setInfo(T info) {
		this.getInfo = info;
		
	}
	
	public NoLista<T> getProximo(){
		return proximo;
	}
	

	public T getGetInfo() {
		return getInfo;
	}

	public void setGetInfo(T getInfo) {
		this.getInfo = getInfo;
	}

	public T getInfo() {
		return info;
	}

	public void setProximo(NoLista proximo) {
		this.proximo = proximo;
	}

}
