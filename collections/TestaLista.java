package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		
		List<Carro> meusCarros = new ArrayList<>();
		
		Carro carro1 = new Carro("Audi X1", 2022, "Prata", "2.2");
		meusCarros.add(carro1);
		
		meusCarros.add(new Carro("Renegade", 2018, "Preto", "2.0"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
		
//		meusCarros.remove(1);
		
		for(Carro carro: meusCarros) {
			System.out.println(carro.toString());
			System.out.println("-----------");
		}
		System.out.println(meusCarros.get(1));
		System.out.println("==========");
		
		//Parâmetro de contains precisa ser um objeto
		System.out.println(meusCarros.contains(carro1));
		
		
		//sort() => Comparable -> para Strings
		Collections.sort(meusCarros);
		System.out.println(meusCarros.toString());
		
		
		meusCarros.sort(new ComparadorDeAnos());
		System.out.println(meusCarros.toString());
		System.out.println("-----------");
		//Colocar em ordem aleatória
		Collections.shuffle(meusCarros);
		System.out.println(meusCarros.toString());
		
		
	}

}
