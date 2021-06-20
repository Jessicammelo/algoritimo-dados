package lista09;

public class ListaOrdenada<T extends Comparable<T>> extends ListaAbstract<T> {

	
	public void inserir(T dado) {
		if (getTamanho() == getLimite()) {
			redimensionar();
		}
		T[] info = getInfo();
		info[getTamanho()] = dado;
		setTamanho(getTamanho() + 1);

	}
	//private int procurarPosicaoInclusao(T itemAdd );
	
	@Override
	//public void inserir(T dado) {
		//if (getLimite() == getTamanho()) {
			//redimensionar();
		//}
		//int posicao = procurarPosicaoInclusao(dado);
		//if (posicao<getTamanho()) {
			//deslocarDados(posicao);
		//}
		
		//Object[] info = getInfo();
		//info[posicao] = dado;
		
		//setTamanho(getTamanho()+1);
	//}


	public int buscar(T dado) {
		T[] info = getInfo();
		for (int i = 0; i < getTamanho(); i++) {
			if (info[i].equals(dado)) {
				return i;
			}
		}
		return -1;
	}

}
