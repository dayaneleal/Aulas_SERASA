import java.util.Scanner;

public class LeituraInformacoesFuncionario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Indique a matricula da funcion�ria: ");
		String matricula = scan.next();
		System.out.println("Indique o nome da funcion�ria: ");
		String nome = scan.next();
		System.out.println("Indique a idade da funcion�ria: ");
		String idade = scan.next();
		System.out.println("Indique o sexo da funcion�ria: ");
		String sexo = scan.next();
		System.out.println("Indique o endereco da funcion�ria: ");
		String endereco = scan.next();
		System.out.println("Indique o bairro da funcion�ria: ");
		String bairro = scan.next();
		System.out.println("Indique o Estado Civil da funcion�ria: ");
		String estadoCivil = scan.next();
		
		System.out.println("O nome da funcion�ria �: " + nome);
	}

}
