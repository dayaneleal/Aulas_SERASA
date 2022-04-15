package exerciciosadicionaiscollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApelidoAmigos {
	
	public Map<String, List<String>> dicionarioApelidos() {
		
		Map<String, List<String>> apelidos = new HashMap<>();
		List<String> apelidosJoao = Arrays.asList("Juan", "Fissura", "Maromba");
		List<String> apelidosMiguel = Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha");
		List<String> apelidosMaria = Arrays.asList("Wonder Woman", "Mary", "Marilene");
		List<String> apelidosLucas = Arrays.asList("Lukinha", "Jorge", "George");
		

		apelidos.put("João", apelidosJoao);
		apelidos.put("Miguel", apelidosMiguel);
		apelidos.put("Maria", apelidosMaria);
		apelidos.put("Lucas", apelidosLucas);
		
		return apelidos;
		
	}
	
}
