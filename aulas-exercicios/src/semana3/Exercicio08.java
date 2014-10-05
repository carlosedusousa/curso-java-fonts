package semana3;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Scanner keyboard = new Scanner(System.in);

		// Captura os dados do teclado e atribui em uma posição
		// específica dentro do array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			arr[i] = keyboard.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] += 2;
			} else {
				arr[i] -= 3;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		keyboard.close();
	}

}
