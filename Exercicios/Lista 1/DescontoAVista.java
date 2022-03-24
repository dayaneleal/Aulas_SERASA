import java.util.Scanner;

public class DescontoAVista {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o valor da mercadoria: ");
			double valor = Double.parseDouble(scan.next());
			double desconto = valor - (valor * 0.15);
			System.out.printf("O valor do produto com desconto é de R$ %.2f" , desconto);
			scan.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}

}
