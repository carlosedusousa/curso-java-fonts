package ces;

import java.util.*;

public class Condicoes {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.		
		Scanner Keybord = new Scanner(System.in);

		System.out.print("Digite o n�mero Inteiro: ");

		int numeroInteiro = Keybord.nextInt();
		// Verifica condi��o se n�mero inteiro
		if (numeroInteiro == 10) {

			System.out.println("A condi��o foi aceita");
		}

		// Verifica condi��o se n�mero doble
		System.out.print("Digite o n�mero Doble: ");
		double numeroDoble = Double.parseDouble(Keybord.next());

		if (numeroDoble == 10.2) {

			System.out.println("A condi��o foi aceita");
		}

		// Verifica se condi��o � string
		System.out.print("Digite a frase: ");
		String frase = Keybord.next();

		if (frase.equals("Oi")) {

			System.out.println("A condi��o foi aceita");
		} else {

			System.out.println("Condi��o n�o aceita");
		}

		Keybord.close();
	}
}
