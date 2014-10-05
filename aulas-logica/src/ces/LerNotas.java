package ces;

import java.util.Scanner;

public class LerNotas {

	public static void main(String[] args) {
		
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);
		
		// Define a quantidade de notas a serem inseridas
		System.out.print("Digite a quantidade de notas que ser�o inseridas: ");
		int quantidade = keyboard.nextInt();
		
		//Instancia a media em zero
		double media = 0;
		// Inicia um Array de notas de tamanho igual ao valor definido
		// anteriormente
		double[] notas = new double[quantidade];
		
		// Salva as notas em um array e adiciona os valores em um
		// variavel que possui o valor total de todas as notas
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite a nota numero " + (i + 1) + " no padr�o (0,0) sem ponto: ");
			notas[i] = keyboard.nextDouble();
		
		}
		
		for (int i = 0; i < quantidade; i++) {
			media += notas[i];
		}
		media = (media/quantidade);		
				
		System.out.println("Media das notas: " + media);
		
		// Imprime as notas acima da media
		System.out.println("\nNotas acima da media: ");
		int i = 0;
		do {
			
			if(notas[i] >= media) {
				System.out.println(notas[i]);
			}
			
			i++;
		} while(i < quantidade);
		
		// Imprime as notas abaixo da media
		System.out.println("\nNotas abaixo da media: ");
		i = 0;
		do {
			
			if(notas[i] < media) {
				System.out.println(notas[i]);
			}
			
			i++;
		} while(i < quantidade);
		
		// Finaliza a leitura do teclado
		keyboard.close();
		
	}

}
