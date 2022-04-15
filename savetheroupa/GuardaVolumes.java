package savetheroupa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
	
	private Map<Integer,List<Peca>> dicionario = new HashMap<>();
	private static Integer identificador = 1;
	
	
	public Integer guardarPecas(List<Peca>listaDePeca) {
		this.dicionario.put(identificador, listaDePeca);
		return identificador++;	
	}
	
	public void mostrarPecas() {
		for(Integer key: dicionario.keySet()) {
			 List<Peca> listaPecas = dicionario.get(key);
			 System.out.println(key +": "+ listaPecas);
		}
	}
	
	public void mostrarPecas(Integer numero) {
		List<Peca> pecas = dicionario.get(numero);
		System.out.println(numero + ": "+ pecas);
		
	}
	
	public void devolverPecas(Integer numero) {

			dicionario.remove(numero);
			System.out.println("Produto Removido com Sucesso!");
				
	}
	
}
