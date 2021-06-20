package lista11;

import lista10.Aluno;

public class App {

	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno[3];
		
		alunos[0] = new Aluno(856884,"Pedro");
		alunos[1] = new Aluno(78979889,"João");
		alunos[2] = new Aluno(13211,"Ana");
		
		OrdenacaoAbstract<Aluno> ordenacao = new OrdenacaoQuickSort<>();
		ordenacao.setInfo(alunos);
		ordenacao.ordenar();
		
		for ( Aluno a : alunos) {
			System.out.println(a);
		}

	}

}
