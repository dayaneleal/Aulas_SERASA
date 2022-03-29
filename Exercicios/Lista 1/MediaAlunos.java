import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o nome do aluno: ");
			String nome = scan.next();
			System.out.println("Informe a nota 1 do aluno: ");
			float n1 = Float.parseFloat(scan.next());
			System.out.println("Informe a nota 2 do aluno: ");
			float n2 = Float.parseFloat(scan.next());
			System.out.println("Informe a nota 3 do aluno: ");
			float n3 = Float.parseFloat(scan.next());
			
			float media = (n1 + n2 + n3) / 3;
			System.out.printf("A média do aluno %s é %.1f", nome, media);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}

}
