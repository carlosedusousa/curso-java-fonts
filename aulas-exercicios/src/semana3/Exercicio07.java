package semana3;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		Scanner keyboard = new Scanner(System.in);

		// Captura os dados do teclado e atribui em uma posição
		// específica dentro do array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			arr[i] = keyboard.nextInt();
		}

		int posicaoDoArrayDeMaiorValor = -1;
		int maiorValor = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > maiorValor) {
				maiorValor = arr[i];
				posicaoDoArrayDeMaiorValor = i;
			}
			
		}
		
		System.out.println(posicaoDoArrayDeMaiorValor);
		keyboard.close();
	}

}
