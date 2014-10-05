package semana2;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int primeiroNumero= keyboard.nextInt();

		System.out.print("Digite o segundo numero: ");
		int segundoNumero = keyboard.nextInt();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O número " + primeiroNumero + " é maior que "
					+ segundoNumero);
		} else if(primeiroNumero < segundoNumero) {
			System.out.println("O número " + segundoNumero + " é maior que "
					+ primeiroNumero);
		} else {
			System.out.println("Os números são iguais");
		}
		
		keyboard.close();
	}

}
