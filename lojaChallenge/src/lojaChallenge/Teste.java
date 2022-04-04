package lojaChallenge;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos = new ArrayList<>(); 
		ArrayList<Clientes> listaClientes = new ArrayList<>(); 
		ArrayList<Compras> listaCompras = new ArrayList<>();
		
		Produto celular = new Produto("A30", 1200.00);
		Produto computador = new Produto("Acer Aspire 5 ", 3299.99);
		
		listaProdutos.add(celular);
		listaProdutos.add(computador);
		
		Clientes cliente1 = new Clientes("Dayane");
		Clientes cliente2 = new Clientes("Gabriel");
		
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		
		Compras compra1 = new Compras(cliente1, celular);
		Compras compra2 = new Compras(cliente1, computador);
		Compras compra3 = new Compras(cliente2, celular);
		
		listaCompras.add(compra1);
		listaCompras.add(compra2);
		listaCompras.add(compra3);
		
		//LISTA DE PRODUTOS COM PREÇO SUPERIOR 1200 REAIS.
		listaProdutos.stream().filter(produto -> produto.getPreco() > 1200)
		.forEach(a -> System.out.println("Produto com valor > R$1200: " + a.getNomeProduto()));
		
		listaClientes.stream().map(cliente -> cliente.getNome()).forEach(c-> System.out.println("Cliente: " + c));
		
		Double totalVendas = listaCompras.stream().mapToDouble(venda -> venda.getProduto().getPreco()).sum();
		
		System.out.println("Valor total em vendas: " + totalVendas);
		
		Double totalCompraCliente = listaCompras.stream().filter(cliente -> cliente.getCliente()
				.equals(cliente1)).mapToDouble(c -> c.getProduto().getPreco()).sum();
		
		System.out.println("A cliente Dayane gastou R$: " + totalCompraCliente);
	}

}
