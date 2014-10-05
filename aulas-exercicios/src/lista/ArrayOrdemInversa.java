package lista;

import java.util.Scanner;

/*
 * Escreva um programa que leia, para um array, um conjunto de 
 * 10 valores e os apresente por ordem inversa.
 */
public class ArrayOrdemInversa {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		int[] valores = new int[10];

		System.out.println("Escreva uma sequencia de 10 números");
		for (int i = 0; i < valores.length; i++) {
			valores[i] = k.nextInt();
		}
		
		for (int i = (valores.length-1); i >= 0; i--) {
			System.out.println(valores[i]);
		}
		
		k.close();
	}

}
