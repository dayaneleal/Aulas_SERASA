import java.util.Scanner;

public class CalculadoraValoresMercadoria {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o código do produto:");
		String codigo = scan.next();
		System.out.println("Digite a descrição do produto:");
		String descricao = scan.next();
		System.out.println("Digite a quantidade do produto:");
		int quantidade = Integer.parseInt(scan.next());
		System.out.println("Preço de compra do produto:");
		float precoCompra = Float.parseFloat(scan.next()) ;
		System.out.println("Percentual de Lucro do Produto:");
		float percentualDeLucro = Float.parseFloat(scan.next())/ 100;
		
		float valorVenda = precoCompra + (precoCompra * percentualDeLucro);
		float precoTotal = quantidade * valorVenda;
		
		System.out.println("Preço da Compra: R$" + precoCompra);
		System.out.println("Percentual de lucro:"+ percentualDeLucro * 100 +"%");
		System.out.println("Preço de Venda: R$" + valorVenda);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço Total: R$" + precoTotal);
		

	}

}
