package textosestrings;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		//Métodos são da Classe Character
		
		
		//Verifica se é um digito
		System.out.println(Character.isDigit('5'));
		System.out.println("========================");
		//Verifica se é uma letra
		System.out.println(Character.isLetter('5'));
		System.out.println(Character.isLetter('a'));
		
		System.out.println(Character.isLetterOrDigit('@'));
		
		//Verificar se o caracter é minúsculo ou maiúsculo
		Character.isUpperCase('A');
		Character.isLowerCase('A');
		
		System.out.println(Character.isWhitespace(' '));
		
		//Substituição de valores
		String arquivo = "escola.java";
		arquivo = arquivo.replace("java", "class");
		System.out.println(arquivo);
		
		//Compara dois valores
		String nome1 = "flavia";
		String nome2 = "Flavia";
		
		System.out.println(nome1.equals(nome2));
		System.out.println(nome1.equalsIgnoreCase(nome2));
		System.out.println();
		System.out.println(nome1.compareTo(nome2)) ;
		//Valor armazenado na posição 5
		System.out.println(nome1.charAt(4));
		
		//Retorna uma parte da string(inicio e fim)
		System.out.println(nome1.substring(2,4));
		
		
	}
	
	
	
	
}
