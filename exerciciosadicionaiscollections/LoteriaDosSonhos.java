package exerciciosadicionaiscollections;

import java.util.HashMap;
import java.util.Map;

public class LoteriaDosSonhos {

	public static void main(String[] args) {
		
		Map<Integer, String> dicionario = new HashMap<>();
		dicionario.put(0, "Ovos");
		dicionario.put(1, "Água");
		dicionario.put(2, "Escopeta");
		dicionario.put(3, "Cavalo");
		dicionario.put(4, "Dentista");
		dicionario.put(5, "Fogo");
		
		for (Map.Entry<Integer, String> entry : dicionario.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + ": " + val);
		}
	}

}
