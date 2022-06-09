package teste;
import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetInt[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			vetInt[i] = entrada.nextInt();
		}
		entrada.close();
		for(int i = 0; i < 10; i++) {
			System.out.print(vetInt[i] + " ");
		}
	}

}
