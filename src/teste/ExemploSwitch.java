package teste;
import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 3: ");
		num = entrada.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Voc� digitou 1");
			break;
		case 2:
			System.out.println("Voc� digitou 2");
			break;
		case 3:
			System.out.println("Voc� digitou 3");
			break;
		default:
			System.out.println("Voc� n�o digitou um n�mero de 1 a 3");
			break;
		}

	}

}
