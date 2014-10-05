package lista;

import java.util.Arrays;

/*
 * Escreva um programa que gere um array de n.ºs inteiros (entre 0 e 100) 
 * e ordene este array por ordem crescente.
 */
public class Ordenacao {

	public static void main(String[] args) {
		int[] array = {10, 32, 21, 100, 34, 42, 12, 54, 99, 23};
		
		Arrays.sort(array);
		
		for(int numero : array) {
			System.out.println(numero);
		}
		

	}

}
