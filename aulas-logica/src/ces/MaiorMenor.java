package ces;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.		
		Scanner Keyboard = new Scanner(System.in);
		// Instancia um n�mero inteiro
		System.out.println("Digite o n�mero: ");
		int numero = Keyboard.nextInt();
		
		// Valida se � maior ou menor
		if (numero >= 10) {
			System.out.println("Numero " + numero + "� maior ou igual a 10");
		}
		if (numero <= 10) {
			System.out.println("Numero " + numero + "� menor ou igual a 10");
		}
		if (!(numero != 10)) {
			System.out.println("Numero " + numero + "� igual a 10");
		}
		
		Keyboard.close();


	}

}
