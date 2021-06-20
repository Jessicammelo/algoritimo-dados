package lista07;

public class ArvoreBinaria<T> extends NoArvoreBinaria<T> {

	public ArvoreBinaria(T info) {
		super(info);
	}

	private NoArvoreBinaria<T> raiz;

	private int tamanho;

	private int info;
	
	public boolean isDegenerada() {
		NoArvoreBinaria<T> no = raiz;
		if (no.getDireita() != null) {
			return false;
		}
		while (no.getEsquerda() != null) {
			no = no.getEsquerda();
			if (no.getDireita() != null) {
				return false;
			}
		}
		return true;
	}
	
	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

	public boolean estaVazia() {
		return (raiz == null);
	}

	public boolean pertence(T info) {
		return pertence(raiz, info);
	}

	private boolean pertence(NoArvoreBinaria<T> no, T info) {
		if (no == null) {
			return false;
		} else {
			return (no.getInfo().equals(info)) || pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
		}

	}

	public String toString() {
		String resultado = "";

		for (int i = tamanho - 1; i >= 0; i--) {
			resultado += info + i;
			if (i > 0) {
				resultado = resultado + ",";
			}
		}
		return resultado;
	}

	private String arvorePre(NoArvoreBinaria<T> no) {
		if (no == null) {
			return "<>";
		} else {
			return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
		}
	}

	public int contarNos() {
		return contarNos(raiz);
	}

	private int contarNos(NoArvoreBinaria<T> no) {
		if (no == null) {
			return 0;
		}else {
			return 1 + 
					contarNos(no.getEsquerda()) +
					contarNos(no.getDireita());
		}
	
	}

}
