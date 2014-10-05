package revisao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Digite o resultado da expressão 15 X 2 - 30 / 3: ");
			numero = keyboard.nextInt();
		} while(numero != 20);
		
		System.out.print("Parabéns, você acertou!");

		keyboard.close();
	}
}
