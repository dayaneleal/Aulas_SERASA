package arrays;

import java.util.Arrays;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int[] a = {-5,2,3,-9,-10, 1,0};
		
		boolean[] b = new boolean[a.length];
		
		for(int i = 0; i < a.length; i ++) {
			if(a[i] > 0) {
				b[i] = true;
			} else {
				b[i] = false;
			}	
			
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
