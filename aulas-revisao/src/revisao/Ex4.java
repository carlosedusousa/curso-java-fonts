package revisao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int valor;
		int par = 0;
		int impar = 0;

		for (int i = 0; i < 6; i++) {
			System.out.print("Digite um número:");

			valor = keyboard.nextInt();

			if ((valor % 2) == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("Pares são " + par);
		System.out.println("Impares são " + impar);

		keyboard.close();
	}
}
