package ces;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.		
		Scanner keyboard = new Scanner(System.in);
		// Instancia vari�veis
		Random gerador = new Random();
		int valor = gerador.nextInt(10) + 1;
		int numero;
		int tentativas = 0;
		// System.out.println(valor);	

		do {
			System.out.println("Digite o n�mero: ");

			numero = keyboard.nextInt();

			// Valida n�mero digitado com sorteado
			if (valor < numero) {
				System.out.println("Tente um numero Menor!\n");
				// Soma as tentativas
				tentativas++;

			} else {
				System.out.println("Tente um numero Maior");
				tentativas++;
			}

			// Enquanto n�o acertar o n�mero repete o la�o
		} while (numero != valor);
		

		// Imprime resultado
		System.out.println("\n\nParab�ns - voc� acertou o n�mero "+ valor +" em " + tentativas
				+ " tentativas");

		keyboard.close();
	}

}