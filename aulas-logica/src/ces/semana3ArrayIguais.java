// 1 - Escreva um programa que determine se dois arrays de n�meros inteiros s�o iguais.

package ces;
import java.util.Scanner;

public class semana3ArrayIguais {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		//cria o primeiro array de compara��o
		int primeiro[] = new int[10];
		//cria o segundo array de compara��o
		int segundo[] = new int[10];
				
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o "+(i+1)+"� numero do Primeiro Array: ");
			int value = keyboard.nextInt();
			primeiro[i] = value;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o "+(i+1)+"� numero do Segundo Array: ");
			int value = keyboard.nextInt();
			segundo[i] = value;
		}
		
		boolean verifica = true;
		for (int i = 0; i < 10; i++) {
			//Verifica se as posi��es guardam o mesmo valor entre os arrays
			if (primeiro[i] != segundo[i]) {
				verifica = false;
			} 
		}
		
		if(!verifica)
				System.out.println("ARRAYS S�O DIFERENTES");
			else
				System.out.println("ARRAYS S�O IGUAIS");
			
		System.out.println("\n");
		for (int i = 0; i < 10; i++) {
			
			System.out.print(primeiro[i] + " | ");
		}
		
		System.out.println("\n");
		for (int i = 0; i < 10; i++) {
			
			System.out.print(segundo[i] + " | ");
		}

		
		keyboard.close();

	}
}