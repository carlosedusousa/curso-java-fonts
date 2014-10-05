package revisao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Qual o primeiro número primo depois do número 100? :");
			numero = keyboard.nextInt();
		} while(numero != 101);
		
		System.out.print("Parabéns, você acertou!");

		keyboard.close();
	}

}
