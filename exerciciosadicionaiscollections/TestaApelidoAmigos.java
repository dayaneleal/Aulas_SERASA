package exerciciosadicionaiscollections;

import java.util.List;
import java.util.Map;

public class TestaApelidoAmigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApelidoAmigos apelidos = new ApelidoAmigos();
		
		Map<String, List<String>> apelidosDicionario = apelidos.dicionarioApelidos();
		apelidosDicionario.forEach((key, value) -> {System.out.println(key + ": "+ value);});
		

	}

}
