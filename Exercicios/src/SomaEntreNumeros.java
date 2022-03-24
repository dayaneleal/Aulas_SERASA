import java.util.Scanner;

public class SomaEntreNumeros {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int numA = scan.nextInt();
			int numB = scan.nextInt();
			
			int soma = numA + numB;
			System.out.println("A soma entre os dois valores é: " + soma);
			
		}catch(Exception e) {
			System.out.println("Erro:" + e);
		}
		

	}

}
