package exerciciosadicionaiscollections;

import java.util.Set;

public class Prova {
	

		public void somaTotal(Set<Integer>conjuntoDeInteiros) 
		{
			int soma = 0;
			
			for(Integer valor : conjuntoDeInteiros) 
			{
				soma = soma + valor;
			}
			System.out.println("A soma total é de: "+ soma);
		}
}
