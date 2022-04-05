package textosestrings;

public class TesteEmail {

	public static void main(String[] args) {
		
		ExpressoesRegulares emailValido = new ExpressoesRegulares("teste@teste.com.br");
		System.out.println("Email: "+ emailValido.getEmail());
		ExpressoesRegulares emailInvalido = new ExpressoesRegulares("testeteste.com");
		
		ExpressoesRegulares2 telefoneValido = new ExpressoesRegulares2("44", "999654321");
		System.out.println(telefoneValido);
	}
}
