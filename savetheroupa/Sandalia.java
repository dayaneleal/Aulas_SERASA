package savetheroupa;

public class Sandalia extends Peca {

	public Sandalia(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirada() {
		 System.out.println("O produto foi retirado");
		
	}

	@Override
	public String toString() {
		return "\nSand�lia " + getMarca() + " - Modelo: " + getModelo();
	}
	
}
