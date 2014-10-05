package ces;

import java.util.Scanner;

public class semana4exercicio0IsPositive {

	public static void main(String[] args) {
		
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite um numero: ");

		// Imprime o resultado proveniente de uma fun��o tern�ria ap�s chamada
		// do m�todo.
		System.out.print(isPositive(keyboard.nextFloat()) ? "POSITIVO" : "NEGATIVO");

		keyboard.close();

	}

	public static boolean isPositive(float num) {
		// return num >= 0.0f; /*FORMA SIMPLIFICADA*/
		if (num < 0)
			return false;
		else
			return true;

	}
}
