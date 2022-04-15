package exerciciosadicionaiscollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

		public void criaLista() {
			List<Integer>lista = Arrays.asList(1,5,5,6,7,8,8,8);
			System.out.println("Lista: " + lista);
		}
		
		public Set<Integer> criaConjunto() {
			Set<Integer>conjunto = new HashSet<>(Arrays.asList(1,5,5,6,7,8,8,8));
			return conjunto;
		}
		
	
}
