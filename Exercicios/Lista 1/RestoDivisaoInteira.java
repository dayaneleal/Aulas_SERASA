import java.util.Scanner;

public class RestoDivisaoInteira {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite um número: ");
			int A = scan.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int B = scan.nextInt();

			int restoDivisao = A % B;
			System.out.println("O resto da divisão entre os dois números é: " + restoDivisao);
			
			scan.close();
			
		} catch (Exception e) {
			System.out.println("Erro na execução do programa: " + e);
		}

	}

}
