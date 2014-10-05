package semana3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double[] d = new double[10];
		
		Scanner keyboard = new Scanner(System.in);
		
		// Captura os dados do teclado e atribui em uma posição 
		// específica dentro do array
		for(int i = 0; i < d.length; i++) {
			System.out.print("Digite o número " + (i+1) + ": ");
			d[i] = keyboard.nextDouble();
		}
		
		// Imprime os dados de dentro do array
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		
		keyboard.close();
	}

}
