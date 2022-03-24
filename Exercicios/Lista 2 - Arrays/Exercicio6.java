package arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class Exercicio6 {
	
	
	public static void main(String[] args) {
		int[] array = {10,20,50,30,5,9,86,14};
		int max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if( array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("O valor máximo é: "+ max);
		
		OptionalInt valor = Arrays.stream(array).max();
		System.out.println("O valor máximo é: " + valor.getAsInt());
		
		
		
	
	}
	
	
}
