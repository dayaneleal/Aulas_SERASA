package exerciciosadicionaiscollections;

import java.util.Set;

public class TestaExercicio2 {

	public static void main(String[] args) {

		Exercicio2 notas = new Exercicio2();
		
		Set<Integer> conjunto = notas.criaConjunto();
		
		notas.criaLista();
		System.out.print("Conjunto: ");
		conjunto.forEach(n -> System.out.print(n + " "));
	}

}
