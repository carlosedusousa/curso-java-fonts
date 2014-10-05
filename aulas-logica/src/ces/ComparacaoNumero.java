package ces;

import java.util.Scanner;

public class ComparacaoNumero {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		// Instancia vari�veis
		int maior;
		int menor;

		//Define valores as vari�veis
		System.out.println("Digite o primeiro n�mero: ");
		int valor1 = keyboard.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int valor2 = keyboard.nextInt();

		// Compara vari�veis e imprime
		if (valor1 < valor2) {
			maior = valor2;
			menor = valor1;
			System.out.println("Maior: " + maior + "\nMenor: " + menor);
		} else if (valor1 > valor2) {
			maior = valor1;
			menor = valor2;
			System.out.println("Maior: " + maior + "\nMenor: " + menor);

		} else {
			System.out.println("Iguais");
		}

		keyboard.close();

	}

}
