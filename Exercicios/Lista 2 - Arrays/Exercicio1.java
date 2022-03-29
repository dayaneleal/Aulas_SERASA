package arrays;

public class Exercicio1 {

	public static void main(String[] args) {

		int[] array1 = new int[11];
		int[] array2 = new int[11];
		int[] array3 = new int[10];
		
		for(int i = 10; i > 0; i-- ) {
			array1[i] = i;
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		for (int i=0; i < 11; i++) {
			array2[i] = i*i;
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			
			if (i < 5) {
				array3[i] = i;	
			} else if(i == 5 ) {
				array3[i] = i * 2;
			} else if(i > 5) {
				array3[i] = array3[i - 1] + 10;
			}
			
			System.out.print(array3[i] + " ");
		}
		
	}

}
