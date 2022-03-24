package arrays;

public class Exercicio4 {

	public static void main(String[] args) {
		int x = 5;
		int i = 0;
		int[] a = { 1,2,3,5,5,6};
		
		for (int num: a) {
			if( x == num) {
				i++;
			}
		}
		
		System.out.println("A quantidade de vezes que x aparece em a é de: " + i);
	}

}
