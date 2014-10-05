package ces;

import java.util.Scanner;

public class NumeroParOuImpar {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.		
		Scanner keyboard = new Scanner(System.in);

		// Instancia um n�mero
		System.out.println("Digite um numero: ");

		double value = Double.parseDouble(keyboard.nextLine());

		// Valida se o n�mero � par ou �mpar
		if (value % 2 == 1)
			System.out.println("N�mero impar.");
		else
			System.out.println("N�mero par.");
		
		keyboard.close();

	}
}
