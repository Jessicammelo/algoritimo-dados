package lista09;

public class ListaOrdenada <T extends Comparable<T>> extends ListaAbstract<ClasseParametrizada> {
	
	protected Object[] info;
	
	

	public void inserir(Object valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	@Override
	int buscar(T valor) {
		// TODO Auto-generated method stub
		return 0;
	}
}
