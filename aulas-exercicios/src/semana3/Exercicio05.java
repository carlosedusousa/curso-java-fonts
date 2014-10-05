package semana3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Scanner keyboard = new Scanner(System.in);

		// Captura os dados do teclado e atribui em uma posição
		// específica dentro do array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			arr[i] = keyboard.nextInt();
		}
		
		System.out.print("\nDigite o número que você irá pesquisar: ");
		int pesquisa = keyboard.nextInt();

		int contador = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == pesquisa) {
				contador++;
			}
		}
		
		System.out.println(contador);

		keyboard.close();
	}

}
