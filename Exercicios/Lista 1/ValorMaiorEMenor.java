import java.util.Scanner;

public class ValorMaiorEMenor {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			
			int numeroA = scan.nextInt();
			int numeroB = scan.nextInt();
			int numeroC = scan.nextInt();
			
			int max = numeroA;
			int min = numeroA;
			
			if (numeroA < numeroB) 
				max = numeroB;
			
			if (numeroB < numeroC) 
				max = numeroC;
			
			if(numeroB < numeroA) 
				min = numeroB;
			
			if(numeroC < numeroB) 
				min = numeroC;
			
			System.out.println("O m�ximo �: " + max + " e o m�nimo: " + min);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
