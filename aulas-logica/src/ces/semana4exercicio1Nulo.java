package ces;

import java.util.Scanner;

public class semana4exercicio1Nulo {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite um numero: ");

		// Imprime o resultado proveniente de uma fun��o tern�ria ap�s chamada
		// do m�todo.
		System.out.print(isZero(keyboard.nextFloat()) ? "NULO" : "N�O NULO");

		keyboard.close();

	}

	// M�todo que compara se o valor digitado � igual a Zero.
	public static boolean isZero(float num) {
		// return num == 0.0f /*FORMA SIMPLIFICADA*/
		if (num == 0)
			return true;
		else
			return false;

	}

}
