package lista05;

public interface Pilha<T> {

	
	public void push(T info);
	
	public T pop();	
	
	//consulta
	public T peek();
	
	public boolean estaVazia();
	
	public void liberar();
}
