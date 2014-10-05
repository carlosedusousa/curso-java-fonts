package ces;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);
		
		// Define antecipadamente a quantidade de notas a serem inseridas
		System.out.print("Quantas notas ser�o inseridas? ");
		int quantidadeNotas = keyboard.nextInt();
		
		// Inicia um Array de notas de tamanho igual ao valor definido
		// anteriormente
		double[] notas = new double[quantidadeNotas];
		
		// Salva as notas em um array e adiciona os valores em um
		// variavel que possui o valor total de todas as notas
		double totalNotas = 0.0;
		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.print("Digite a nota n�mero " + (i + 1) + ": ");
			notas[i] = keyboard.nextDouble();
			totalNotas += notas[i];
		}
		
		// Calcula a média das notas
		double media = totalNotas / quantidadeNotas;
		System.out.println("Média: " + media);
		
		// Imprime as notas acima da média
		System.out.println("\nNotas acima da média: ");
		for(int i = 0; i < quantidadeNotas; i++) {
			if(notas[i] >= media) {
				System.out.println(notas[i]);
			}
		}
		
		// Imprime as notas abaixo da média
		System.out.println("\nNotas abaixo da média: ");
		for(int i = 0; i < quantidadeNotas; i++) {
			if(notas[i] < media) {
				System.out.println(notas[i]);
			}
		}
		
		// Para de ler eventos do teclado
		keyboard.close();
		
	}

}
