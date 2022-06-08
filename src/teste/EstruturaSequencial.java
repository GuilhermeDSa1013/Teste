package teste;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1, a2, a3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a 1a altura:");
		a1 = entrada.nextDouble();
		System.out.println("Digite a 2a altura:");
		a2 = entrada.nextDouble();
		System.out.println("Digite a 3a altura:");
		a3 = entrada.nextDouble();
		
		String frase = ("A média das alturas fornecidas é: ");
		
		System.out.println(frase + (a1 + a2 + a3)/3);
		
			
	}

}
