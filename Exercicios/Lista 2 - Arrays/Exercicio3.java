package arrays;

public class Exercicio3 {
	
	public static void main(String[] args) {
		int[] array = {-1,-2,0,1,2,3};
		
		int i = 0;
		
		for(int num: array) {
			if(num < 0) {
				i++;
			}
		}
		System.out.println("O total de número negativos é: " + i);
	}
	

}
