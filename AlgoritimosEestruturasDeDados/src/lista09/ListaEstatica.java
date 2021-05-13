package lista09;

public class ListaEstatica extends ListaAbstract {

	@Override
	void inserir(Object valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	@Override
	int buscar(Object valor) {
		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return tamanho;
	}
}
