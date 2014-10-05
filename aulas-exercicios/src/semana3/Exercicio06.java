package semana3;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Scanner keyboard = new Scanner(System.in);

		// Captura os dados do teclado e atribui em uma posição
		// específica dentro do array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			arr[i] = keyboard.nextInt();
		}

		boolean[] b = new boolean[arr.length]; // todos os booleans são false
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				b[i] = true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			String palavra = b[i] ? "verdadeiro" : "falso";
			System.out.println(arr[i] + " : " + palavra);
//			if(b[i]) {
//				System.out.println(arr[i] + " : " + "verdadeiro");
//			} else {
//				System.out.println(arr[i] + " : " + "falso");
//			}
		}
		keyboard.close();
	}

}
