package collections;

import java.util.Optional;
import java.util.OptionalInt;

public class TesteOptional {

	public static void main(String[] args) {
		// m�todo of recebe valor do tipo que estamos trabalhando
		Optional<String> listaString = Optional.of("Valor optional presente");
		//optional � classe est�tica
		listaString.ifPresentOrElse(System.out::println,() -> System.out.println("N�o est� presente") );//express�o lambda
		
		Optional<String> listaNula = Optional.ofNullable(null);
		listaNula.ifPresentOrElse(System.out::println, ()-> System.out.println("Nulo"));
		
		Optional<String> listaVazia = Optional.empty();
		listaNula.ifPresentOrElse(System.out::println, ()-> System.out.println("Vazio"));
		
//		Optional<String>listaComErro = Optional.of(null);
//		listaComErro.ifPresentOrElse(System.out::println, ()-> System.out.println("Erro"));
		
		OptionalInt.of(22).ifPresent(System.out::println);
		
	}

}
