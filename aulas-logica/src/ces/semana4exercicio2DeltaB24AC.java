package ces;

import java.util.Scanner;

public class semana4exercicio2DeltaB24AC {

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

		System.out.println(delta(a, b, c));
		keyboard.close();

	}

	public static int delta(int a, int b, int c) {

		return (b * b) - (4 * a * c);

	}

	//Sobrecarga de m�todos - pode-se reecrever varia��es de m�todos com tipos de vari�veis diferentes.
	public static double delta(double a, double b, double c) {

		return Math.pow(b, 2) - (4 * a * c);

	}

}