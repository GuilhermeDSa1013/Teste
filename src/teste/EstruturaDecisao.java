package teste;
import java.util.Scanner;

public class EstruturaDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		n1 = entrada.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		n2 = entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1 + " � maior que " + n2);
		} else {
			if (n1 < n2)
				System.out.println(n1 + " � menor que " + n2);
			else
				System.out.println("Os n�meros s�o iguais");
			
		}
		
	}

}
