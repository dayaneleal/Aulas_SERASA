import java.util.Scanner;

public class RestoDivisaoInteira {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Digite um n�mero: ");
			int A = scan.nextInt();
			
			System.out.println("Digite o segundo n�mero: ");
			int B = scan.nextInt();

			int restoDivisao = A % B;
			System.out.println("O resto da divis�o entre os dois n�meros �: " + restoDivisao);
			
			scan.close();
			
		} catch (Exception e) {
			System.out.println("Erro na execu��o do programa: " + e);
		}

	}

}
