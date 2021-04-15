package lista07;

public class ArvoreBinaria<T> extends NoArvoreBinaria<T> {

	private int tamanho;
	
	private int info;

	public ArvoreBinaria() {
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
	}

	public boolean estaVazia() {
		return false;
	}

	public boolean pertence(T info) {
		return false;
	}

	private boolean pertence(NoArvoreBinaria<T> no, T info) {
		return false;
	}

	public String toString() {
		String resultado = "";

		for (int i = tamanho - 1; i >= 0; i--) {
			resultado += info +i;
			if (i > 0) {
				resultado = resultado + ",";
			}
		}
		return resultado;
	}
	
	private String arvorePre( NoArvoreBinaria<T> no) {
		return toString();
	}
	
	public int contarNos() {
		return info;
	}
	
	private int contarNos(NoArvoreBinaria<T> no ) {
	return info;	
	}
	
	

}
