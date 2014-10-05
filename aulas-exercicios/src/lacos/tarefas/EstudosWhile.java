package lacos.tarefas;

import java.util.Scanner;


public class EstudosWhile {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite o número (-1 para sair): ");
		int numero = keyboard.nextInt();
		while(numero != -1) {
			System.out.println("Numero é igual: " + numero);
			System.out.print("Digite o número (-1 para sair): ");
			numero = keyboard.nextInt();
		}

		keyboard.close();
	}

}
