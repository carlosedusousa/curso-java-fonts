package ces;

import java.util.Scanner;

public class ArrayD10Valores {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		double d[] = new double[2];
		// Instancia um n�mero

		for (int i = 0; i < 2; i++) {
			System.out.print("Digite um numero: ");
			double value = Double.parseDouble(keyboard.nextLine());
			d[i] = value;
		}

		for (int i = 0; i < 2; i++) {
			// print normal imprime na mesma linha.
			System.out.print(d[i] + "; ");
		}

		for (int i = 0; i < 2; i++) {
			// print normal imprime na mesma linha.
			// (BONUS: apenas 2 casas depois da v�rgula.)
			System.out.printf("%.2f ", d[i]);
		}

		keyboard.close();

	}
}
