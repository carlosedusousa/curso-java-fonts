package ces;

import java.util.Scanner;

public class semana4exercicio6e7MathMaxMathMin {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite A: ");
		double a = keyboard.nextFloat();

		System.out.print("Digite B: ");
		double b = keyboard.nextFloat();

		System.out.print("Digite C: ");
		double c = keyboard.nextFloat();

		System.out.println("\nMaior " + maior(a, b, c));

		System.out.println("\nMenor " + menor(a, b, c));

		keyboard.close();

	}

	// M�todo que retorna o maior n�mero de 3 comparados.
	public static double maior(double a, double b, double c) {

		return Math.max(a, Math.max(b, c));

	}

	// M�todo que retorna o menor n�mero de 3 comparados.
	public static double menor(double a, double b, double c) {

		return Math.min(a, Math.min(b, c));

	}
}