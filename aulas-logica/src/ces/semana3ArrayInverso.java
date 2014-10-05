//2 - Escreva um programa que leia, para um array, um conjunto de 10 valores e os apresente por ordem inversa. 
package ces;
import java.util.Scanner;

public class semana3ArrayInverso {

	// 1 - Escreva um programa que determine se dois arrays de n�meros inteiros s�o iguais.
		public static void main(String[] args) {
			// Instancia um objeto do tipo Scanner que serve
			// para ler dados a partir do teclado.
			Scanner keyboard = new Scanner(System.in);

			//cria o arrayInverso array de compara��o
			int arrayInverso[] = new int[10];
			//cria o segundo array de compara��o
			//int segundo[] = new int[10];
					
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite o "+(i+1)+"� numero do Array: ");
				int value = keyboard.nextInt();
				arrayInverso[i] = value;
			}
			
			// La�o para imprimir em ordem invertida.
			for (int i = 9; i >= 0; i--) {

				System.out.print(arrayInverso[i] + " | ");

			}

			keyboard.close();

		}
	}

