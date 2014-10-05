package ces;

import java.util.Scanner;

public class QuebraDeLinhaParaR {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String frase = "O Nassor n�o sabe preparar aula";
		System.out.println(frase);

		System.out.println(frase.replaceAll("r", "\n"));
		keyboard.close();
	}
}
