package lacos.tarefas;

import java.util.Scanner;


public class EstudosDoWhile {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Digite o número (-1 para sair): ");
			numero = keyboard.nextInt();
		} while(numero != -1);

		keyboard.close();
	}

}
