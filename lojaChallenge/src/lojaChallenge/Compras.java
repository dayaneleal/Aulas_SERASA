package lojaChallenge;

public class Compras {

	private Clientes cliente;
	private Produto produto;
	
	public Compras(Clientes cliente, Produto produto) {
		super();
		this.cliente = cliente;
		this.produto = produto;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}
