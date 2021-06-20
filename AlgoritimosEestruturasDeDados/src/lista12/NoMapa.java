package lista12;

public class NoMapa<T> {

	private int chave;
	private T info;
	
	
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
	public boolean equals(Object obj) {
		return false;
	}

	
	
}
