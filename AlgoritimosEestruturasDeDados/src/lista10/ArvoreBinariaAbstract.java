package lista10;

import lista07.NoArvoreBinaria;

public class ArvoreBinariaAbstract<T> {

	private NoArvoreBinaria<T> raiz;

	public ArvoreBinariaAbstract() {
		raiz = null;
	}

	protected void setRaiz(NoArvoreBinaria<T> raiz) {

	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	public boolean estaVazia() {
		return false;
	}

	public boolean pertence(T info) {
		return false;
	}

	//public abstract NoArvoreBinaria<T> buscar(T info){
		
	//}

	private String arvorePre(NoArvoreBinaria<T> no) {
		return toString();
	}

	public String toString() {
		return arvorePre(raiz);
	}

	public int contarNos() {
		return contarNos();
	}

	private int contasNos(NoArvoreBinaria<T> no) {
		return contarNos();
	}
	
	

}
