package ces;

import java.util.Scanner;

public class RepeteIntNoArray {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		int d[] = new int[10];
		// Instancia um n�mero

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um numero: ");

			int value = keyboard.nextInt();

			d[i] = value;

		}
		
		System.out.print("AGORA \nEscolha o numero: ");

		int numero = keyboard.nextInt();


		int aparece =0;
		for (int i = 0; i < 10; i++) {
			
			if(d[i] == numero){
				aparece++;
			}
			
		}
		
		System.out.print("Temos o n�mero " +numero+ " repetindo " +aparece+ " vezes!");

		keyboard.close();

	}
}