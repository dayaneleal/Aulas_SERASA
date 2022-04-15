package savetheroupa;

import java.util.ArrayList;
import java.util.List;

public class TestaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandalia sandalia1 = new Sandalia("Schutz", "Sandália de Strass");
		Sandalia sandalia2 = new Sandalia("Vizzano", "Sapatilha Casual");
		Sandalia sandalia3 = new Sandalia("Azaléia", "Rasteira Animal Print");
		Calca calca1 = new Calca("Youcom", "Mom Jeans");
		Calca calca2 = new Calca("Hering", "Calça Skinny");
		
		List<Peca>lista1 = new ArrayList<>();
		lista1.add(sandalia2);
		lista1.add(sandalia1);
		
		List<Peca>lista2 = new ArrayList<>();
		lista2.add(calca1);
		lista2.add(calca2);
		lista2.add(sandalia3);
		
		GuardaVolumes guardaVolumes = new GuardaVolumes();
		guardaVolumes.guardarPecas(lista1); 
		guardaVolumes.guardarPecas(lista2);
		guardaVolumes.mostrarPecas();
		System.out.println("--------------");
		guardaVolumes.mostrarPecas(1);
		System.out.println("--------------");
		guardaVolumes.devolverPecas(1);
		System.out.println("--------------");
		guardaVolumes.mostrarPecas();
	}

}
