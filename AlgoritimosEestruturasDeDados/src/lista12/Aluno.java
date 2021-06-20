package lista12;

import java.util.Date;

public class Aluno {

	private int matricula;
	private String nome;
	private Date dataNasc;
	
	public Aluno(int matricula, String nome, Date dataNasc) {
		
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

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
}
