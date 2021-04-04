package app;

import lista01.ListaEstatica;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ListaEstatica le = new ListaEstatica();
//		le.inserir(5);
//		le.inserir(10);
//		le.inserir(15);
//		le.inserir(20);
//
//		System.out.println(le.toString());
//		System.out.println(le.getTamanho());
//		System.out.println(le.buscar(15));
//		System.out.println(le.buscar(30));
//		le.retirar(10);
//		System.out.println(le.toString());
//		System.out.println(le.getTamanho());
//
//		ListaEstatica li = new ListaEstatica();
//	li.inserir(1);
//	li.inserir(2);
//	li.inserir(3);
//	li.inserir(4);
//		li.inserir(5);
//	li.inserir(6);
//	li.inserir(7);
//	li.inserir(8);
//	li.inserir(9);
//		li.inserir(10);
//	li.inserir(11);
//	li.inserir(12);
//	li.inserir(13);
//	li.inserir(14);
//		li.inserir(15);
//		li.inserir(20);

//	System.out.println(li.toString());
//	System.out.println(li.getTamanho());
//	System.out.println(li.obterElemento(3));
		// System.out.println(li.obterElemento(5));
		// li.liberar();
		// System.out.println(li.estaVazia());

		lista02.ListaEstatica<Integer> testes = new lista02.ListaEstatica<>();

		// Teste teste = new Teste();
		// teste.setNome("João");
		// teste.setEndereco("Rua sao paulo");

//		testes.inserir(5);
//		testes.inserir(10);
//		testes.inserir(15);
//		testes.inserir(20);
//		testes.inverter();
//
//		System.out.println(testes.toString());

		testes.inserir(5);
		testes.inserir(10);
		testes.inserir(15);
		testes.inserir(20);
		testes.inserir(25);
		testes.inserir(30);
		
		testes.inverter();
		
		System.out.println(testes.toString());

//	testes.inserir(teste);
//	
//	Teste teste2 = new Teste();
//	teste2.setNome("ana");
//	
//	testes.inserir(teste2);
//	
//	Teste teste3 = new Teste();
//	teste3.setNome("Marco");
//	
//	testes.inserir(teste3);
//	testes.exibir();
//	testes.inverter();
//	testes.exibir();
//	System.out.println(testes.obterElemento(0).getNome());
//	testes.inverter();
//	System.out.println(testes.obterElemento(0).getNome());
//		
//	}
//	
//	
	}
}
