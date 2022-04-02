package dcblbank;

public interface AcessoInterno {

	//Os métodos não tem comportamento, apenas assinatura
	
	/**
	 * 
	 * @param usuario -> pode informar um nome de usuario válido
	 * @param senha -> pode informar uma senha de até 255 caracteres alfanumericos
	 * @return retorna verdadeiro se a senha estiver correta
	 */
	public boolean autenticarSistema(String usuario, String senha);
	
	public void alterarSenha(String senhaAntiga, String novaSenha);
	public void alterarUsuario(String usuarioAntigo, String usuarioNovo);
}
