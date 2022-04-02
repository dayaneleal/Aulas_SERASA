package dcblbank;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno {

	// mockado
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super(nome, cpf, ctps, salario, dataAdmissao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getSalario() * 0.1;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void alterarSenha(String senhaAntiga, String novaSenha) {
		if (this.senha.equals(senhaAntiga)) {
			if(novaSenha.length() < 12) {
				this.senha = novaSenha;
				System.out.println("Nova Senha cadastrada com sucesso.");
			} else {
				System.out.println("Informe uma senha com at� 12 caracteres.");
			}
		} else {
			System.out.println("Senha Antiga inv�lida");
		}

	}

	@Override
	public void alterarUsuario(String usuarioAntigo, String usuarioNovo) {
		if (this.usuario.equals(usuarioAntigo)) {
			if(usuarioNovo.length() < 8) {
				this.usuario = usuarioNovo;
				System.out.println("Novo Usu�rio cadastrado com sucesso.");
			} else {
				System.out.println("Informe um usu�rio com at� 8 caracteres.");
			}
		} else {
			System.out.println("Usu�rio Antigo inv�lido. Informe o Usu�rio correto.");
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

}
