import java.util.Scanner;

public class CalculoAbonoESalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o Departamento do Funcion�rio: ");
		String departamento = scan.next();
		System.out.println("Informe o nome do Funcion�rio: ");
		String nome = scan.next();
		System.out.println("Informe o sal�rio do Funcion�rio: ");
		float salario = Float.parseFloat(scan.next());
		
		float abono = (float) (salario * 0.1);
		float novoSalario = salario + abono;
		
		System.out.println("O novo sal�rio � de R$ " + novoSalario);
	}

}
