import java.util.Scanner;

public class ContaComGorjeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Digite o valor da conta: ");
			
			double conta = Double.parseDouble(scanner.next());
			
			double valorDaContaComGorjeta = (conta * 0.1) + conta;
			
			System.out.println("O valor da conta, incluindo os 10% do garçom é de: " + valorDaContaComGorjeta);
			
			scanner.close();
		}

	}

}
