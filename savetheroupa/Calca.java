package savetheroupa;

public class Calca extends Peca {

	public Calca(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirada() {
		System.out.println("Produto Retirado");
	}

	@Override
	public String toString() {
		return "\nCalça " + getMarca() + " - Modelo: " + getModelo() ;
	}
	
	

}
