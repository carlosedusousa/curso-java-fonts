//Crie um aplicativo de convers�o entre as temperaturas Celsius e Farenheit.
//Primeiro o usu�rio deve escolher se vai entrar com a temperatura em C�lsius ou Farenheit, 
//depois a convers�o escolhida � realizada atrav�s de um comando switch.
//Se C � a temperatura em C�lsius e F em farenheit, as f�rmulas de convers�o s�o:
//C= 5.(F-32)/9
//F= (9.C/5) + 32
package ces;

import java.util.Scanner;

public class semana4exercicio10Temperatura {

	public static void main(String[] args) {

		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Entrar com a temperatura "
				+ "\nem Farenheit digite (F) " + "\nem Celsius digite (C): ");

		// Vari�vel escolha recebe a string correspondente para compara��o.
		String escolha = keyboard.next();

		// Vari�vel temperatura recebe valor da temperatura
		System.out.println("Digite a temperatura: ");
		double temperatura = keyboard.nextDouble();

		// Valida a vari�vel escolha independentemente de mai�cula ou min�scula.
		// Chama o m�todo correspondente para a convers�o.
		switch (escolha.toLowerCase()) {
		case "f":
			System.out.println("Celsius " + celsius(temperatura) + "�");
			break;
		case "c":
			System.out.println("Farenheit " + farenheit(temperatura) + "�");
			break;
		}

		keyboard.close();

	}

	// M�todo de c�culo de celsius para farenheit.
	public static double farenheit(double temperatura) {

		return (9 * (temperatura / 5)) + 32;

	}

	// M�todo de c�culo de farenheit para celsius.
	public static double celsius(double temperatura) {

		return (5 * (temperatura - 32)) / 9;

	}
}
