package exercicioregex;

public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno("Dayane", "Leal","(99)9999-9999");
		System.out.println(aluno.valida(aluno));
		System.out.println(aluno.validaTelefone(aluno));
	}

}
