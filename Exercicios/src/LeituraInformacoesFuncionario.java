import java.util.Scanner;

public class LeituraInformacoesFuncionario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Indique a matricula da funcionária: ");
		String matricula = scan.next();
		System.out.println("Indique o nome da funcionária: ");
		String nome = scan.next();
		System.out.println("Indique a idade da funcionária: ");
		String idade = scan.next();
		System.out.println("Indique o sexo da funcionária: ");
		String sexo = scan.next();
		System.out.println("Indique o endereco da funcionária: ");
		String endereco = scan.next();
		System.out.println("Indique o bairro da funcionária: ");
		String bairro = scan.next();
		System.out.println("Indique o Estado Civil da funcionária: ");
		String estadoCivil = scan.next();
		
		System.out.println("O nome da funcionária é: " + nome);
	}

}
