package lista09;

public class Fornecedor {

	private String nome;
	
	private String cnpj;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public int compareTo(Fornecedor o) {
		return this.getCnpj().compareTo(o.getCnpj());
	}
	
}
