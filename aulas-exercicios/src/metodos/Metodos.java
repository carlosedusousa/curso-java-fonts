package metodos;

import java.util.Scanner;

/*
 * A definiÃ§Ã£o dos mÃ©todos tÃªm quatro partes bÃ¡sicas:
 * - O nome do mÃ©todo;
 * - O tipo objeto ou tipo primitivo de retorno;
 * - Uma lista de parÃ¢metros;
 * - O corpo do mÃ©todo;
 */
public class Metodos {

	/*
	 * O que aparece abaixo Ã© um mÃ©todo!
	 * 
	 * Ele se chama main, tem como argumento um array de strings, nÃ£o tem
	 * retorno algum e tem como corpo tudo que vai ser executado pelo programa
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Soma um array de nÃºmeros
		int[] idades = { 30, 30, 30, 30, 30, 30 };
		int somatorio = somaArray(idades);
		System.out.println(somatorio);

		int soma = somaDois(12 , 34); 
		System.out.println(soma);
		System.out.println(somaDois(10, 10));
		System.out.println(somaDois(10, 40));
		
		int primeiroParametro = keyboard.nextInt();
		int segundoParametro = keyboard.nextInt();
		
		soma = somaDois(primeiroParametro, segundoParametro);
		System.out.println(soma);
		
		keyboard.close();
	}
	
	public static int somaDois(int a, int b) {
		return a + b;
	}
	
	// Retorna o somatÃ³rio dos nÃºmeros do array
	public static int somaArray(int[] numeros) {
		int c = 0;
		for (int numero : numeros) {
			c += numero;
		}

		return c;
	}
	

}
