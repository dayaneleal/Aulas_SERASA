package savetheroupa;

public abstract class Peca {

	private String marca;
	private String modelo;
	
	
	public Peca(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}


	public abstract void retirada();
	

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "marca:" + getMarca() + ", modelo:" + getModelo();
	}
	
}
