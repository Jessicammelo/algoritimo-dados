package lista10;

public class Aluno implements Comparable<Aluno> {

	private int matricula;

	private String nome;

	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int compareTo(Aluno outro) {
		if (this.getMatricula() < outro.getMatricula()) {
			return -1;
		}
		return compareTo(outro);
	}
}
