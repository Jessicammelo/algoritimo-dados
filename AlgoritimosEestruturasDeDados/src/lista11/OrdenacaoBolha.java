package lista11;

public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	public void ordenar() {
		int i;
		int j;
		T[] info = getInfo();
		int n = info.length;

		for (i = n - 1; i >= 1; i--) {
			for (j = 0; j <= i; j++) {
				if (info[j].compareTo(info[j + 1]) > 0) {
					trocar(j, j + 1);
				}
			}
		}
	}
}
