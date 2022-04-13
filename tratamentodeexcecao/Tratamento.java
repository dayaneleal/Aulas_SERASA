package tratamentodeexcecao;

import java.io.FileNotFoundException;

public class Tratamento {
	
	public static void metodo1() {
		System.out.println("Inicio do teste");
		metodo2();
		System.out.println("Fim do teste");
	}
	
	public static void metodo2() {
		try {
			System.out.println("Inicio do meotodo 2");
		int array[] = new int[10];
		
		for(int i =0; i < 20; i++) {
			array[i] = i;
			System.out.println(i);
		}
		
		System.out.println("Fim do metodo2");
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Houve uma erro: " + e);
		} finally {
			System.out.println("Uma execução que vai sempre aparecer na finalização");
		}
		
	}
	
	public static void metodo3() throws FileNotFoundException {
		new java.io.FileReader("arquivoDeTeste.txt");
	}
	
}
