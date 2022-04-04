package lojaChallenge;

public class Produto {

	private double preco;
	private String nomeProduto;
	
	public Produto(String nomeProduto, double preco)  {
		super();
		this.preco = preco;
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
}
