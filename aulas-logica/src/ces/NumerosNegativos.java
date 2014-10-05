package ces;

import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		int d[] = new int[5];
		// Instancia um n�mero

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um numero: ");

			int value = keyboard.nextInt();

			d[i] = value;

		}

		int negativos=0;
		for (int i = 0; i < 5; i++) {
			
			if(d[i]< 0){
			// print normal imprime na mesma linha.
				System.out.print(d[i] + " | ");
				negativos++;
			}
			
		}
		System.out.print("Temos " + negativos + " n�meros negativos!");

		keyboard.close();

	}
}