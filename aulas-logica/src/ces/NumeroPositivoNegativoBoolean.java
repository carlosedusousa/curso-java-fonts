package ces;

import java.util.Scanner;

public class NumeroPositivoNegativoBoolean {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		int d[] = new int[10];
		// Instancia um n�mero
		boolean posicao[] = new boolean[10];
				
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um numero: ");

			int value = keyboard.nextInt();

			d[i] = value;

		}

		for (int i = 0; i < 10; i++) {

			if (d[i] <= 0) {
				posicao[i] = false;
			} else
				posicao[i] = true;

		}
		
		int maior=0;
		for (int i = 0; i < 10; i++) {
			
			if(i == 0){
				maior = 0;
			} else if(d[i] > d[maior] ){
				maior =i ;
			} 
		
		}

		for (int i = 0; i < 10; i++) {

			System.out.print(posicao[i] + " | ");

		}
		System.out.print("O maior est� na posi��o: " +maior);
		
		keyboard.close();

	}
}