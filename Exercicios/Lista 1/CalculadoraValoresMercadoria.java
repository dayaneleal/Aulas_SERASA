import java.util.Scanner;

public class CalculadoraValoresMercadoria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do produto:");
		String codigo = scan.next();
		System.out.println("Digite a descri��o do produto:");
		String descricao = scan.next();
		System.out.println("Digite a quantidade do produto:");
		int quantidade = Integer.parseInt(scan.next());
		System.out.println("Pre�o de compra do produto:");
		float precoCompra = Float.parseFloat(scan.next()) ;
		System.out.println("Percentual de Lucro do Produto:");
		float percentualDeLucro = Float.parseFloat(scan.next())/ 100;
		
		float valorVenda = precoCompra + (precoCompra * percentualDeLucro);
		float precoTotal = quantidade * valorVenda;
		
		System.out.println("Pre�o da Compra: R$" + precoCompra);
		System.out.println("Percentual de lucro:"+ percentualDeLucro * 100 +"%");
		System.out.println("Pre�o de Venda: R$" + valorVenda);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Pre�o Total: R$" + precoTotal);
		

	}

}
