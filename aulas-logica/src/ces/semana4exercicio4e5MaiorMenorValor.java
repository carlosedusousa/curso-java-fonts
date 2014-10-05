package ces;

import java.util.Scanner;

public class semana4exercicio4e5MaiorMenorValor {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		// Instancia vari�veis
		int a;
		int b;

		// Define valores as vari�veis
		System.out.println("Digite o primeiro n�mero: ");
			a = keyboard.nextInt();
			
		System.out.println("Digite o segundo n�mero: ");
			b = keyboard.nextInt();

		System.out.println("\nMaior " + maior(a, b));
		keyboard.close();
		
		System.out.println("\nMenor " + menor(a, b));
		keyboard.close();

	}

	// M�todo que retorna o maior n�mero de 2 comparados sem usar o m�todo Math.
	public static int maior(int a, int b) {
		//return a > b ? a: b;
		if (a >= b)
			return a;
		else
			return b;

	}

	// M�todo que retorna o menor n�mero de 2 comparados sem usar o m�todo Math.
	public static int menor(int a, int b) {
		if (a <= b)
			return a;
		else
			return b;

	}

}