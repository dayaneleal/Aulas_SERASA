import java.util.Scanner;

public class ValorTroco {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Indique o valor da mercadoria: ");
			double valorMercadoria = Double.parseDouble(scan.next());
			System.out.println("Indique o valor em dinheiro pago: ");
			double valorPago = Double.parseDouble(scan.next());
			
			double troco = valorPago - valorMercadoria;
			
			System.out.printf("O valor do troco é de: R$%.2f", troco);
			scan.close();
		}
	}

}
