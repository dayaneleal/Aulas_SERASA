package collections;

import java.util.Optional;
import java.util.OptionalInt;

public class TesteOptional {

	public static void main(String[] args) {
		// método of recebe valor do tipo que estamos trabalhando
		Optional<String> listaString = Optional.of("Valor optional presente");
		//optional é classe estática
		listaString.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente") );//expressão lambda
		
		Optional<String> listaNula = Optional.ofNullable(null);
		listaNula.ifPresentOrElse(System.out::println, ()-> System.out.println("Nulo"));
		
		Optional<String> listaVazia = Optional.empty();
		listaNula.ifPresentOrElse(System.out::println, ()-> System.out.println("Vazio"));
		
//		Optional<String>listaComErro = Optional.of(null);
//		listaComErro.ifPresentOrElse(System.out::println, ()-> System.out.println("Erro"));
		
		OptionalInt.of(22).ifPresent(System.out::println);
		
	}

}
