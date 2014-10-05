package ces;

import java.util.Scanner;

public class EstudoWhile {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		int numero;
		//numero � declarado pois o bloco do/while deve saber quem � o numero, 
		//caso a declara��o do numero for dentro do bloco o java dar� erro

		// Enquanto o usu�rio n�o digitar -1 para sair ele ficar� digitando um novo n�mero
		do {
			System.out.println("Digite o numero (digite -1 para sair): ");
			numero = keyboard.nextInt();
 
		} while (numero != -1);

		keyboard.close();
	}
}
