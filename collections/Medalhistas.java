package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Medalhistas {

	public static void main(String[] args) {
		Map<String, Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();
		//put => adicionar valores ao map
		
		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Japão", 58);
		quadroMedalhasOlimpicas2020.put("Grã-Bretanha", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);
		
		//Buscar Informações através de um valor e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("China"));
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(58));
		//Informa o tamanho do map
		System.out.println(quadroMedalhasOlimpicas2020.size());
		//Consultar o valor armazenado na chave
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));
		//Remover os valores da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		System.out.println(quadroMedalhasOlimpicas2020.toString());
		
		for(Map.Entry<String, Integer> entry: quadroMedalhasOlimpicas2020.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		for(String key: quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key + "=>" + quadroMedalhasOlimpicas2020.get(key));
		}
		
		//Implementaçao de TreeMap
		
		TreeMap<String,Integer>quadroMedalhasOlimpicas2016 = new TreeMap<>();
		quadroMedalhasOlimpicas2016.put("EUA", 103);
		quadroMedalhasOlimpicas2016.put("China", 90);
		quadroMedalhasOlimpicas2016.put("Japão", 50);
		quadroMedalhasOlimpicas2016.put("Grã-Bretanha", 70);
		quadroMedalhasOlimpicas2016.put("Brasil", 17);
		
		System.out.println(((TreeMap<String, Integer>) quadroMedalhasOlimpicas2016).firstKey());
		System.out.println(((TreeMap<String, Integer>) quadroMedalhasOlimpicas2016).lastKey());
		
		System.out.println(quadroMedalhasOlimpicas2016.lowerKey("China"));
		System.out.println(quadroMedalhasOlimpicas2016.higherKey("China"));
		
		System.out.println(((TreeMap<String, Integer>) quadroMedalhasOlimpicas2016).pollFirstEntry()); //Exibe o valor e apaga posteriormente
		System.out.println(((TreeMap<String, Integer>) quadroMedalhasOlimpicas2016).pollLastEntry());
		
		
		
	}

}
