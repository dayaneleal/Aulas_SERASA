package exercicioregex;

public class Aluno {

	private String nome;
	private String sobrenome;
	private String telefone;
	
	
	
	public Aluno(String nome, String sobrenome, String telefone) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}


	public boolean valida(Aluno aluno ) {
		String nome = aluno.getNome();
		return nome.matches("[A-Z][a-z]{1,}");
		
	}
	
	public boolean validaTelefone(Aluno aluno) {
		String telefone = aluno.getTelefone();
		return telefone.matches("[(]\\d{2}[)]\\d{4}[-]\\d{4}");
	}


	public String getNome() {
		return nome;
	}


	public String getTelefone() {
		return telefone;
	}


	
}
