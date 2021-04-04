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
	
	public void setProximo(NoLista<T> proximo) {
		
	}
}
