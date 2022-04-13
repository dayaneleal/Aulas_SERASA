package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>estudantes = new ArrayList<>();
		
		estudantes.add("Maria");
		estudantes.add("José");
		estudantes.add("Antonio");
		estudantes.add("Pedro");
		
		estudantes.stream().forEach(System.out::println);
		//O String cria uma sublista;
		
		System.out.println(estudantes.stream().count());
		
		//Qual o maior nome da lista
		System.out.println("Maior nome: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		System.out.println("Maior nome: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
	}

}
