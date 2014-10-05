package revisao;

import java.util.Random;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		Random gerador = new Random();
		int sorteado = gerador.nextInt(10) + 1;
		int valor;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 10:");

		valor = keyboard.nextInt();

		if (valor == sorteado)
			System.out.println("Você acertou!");
		else
			System.out.println("Você errou!");

		keyboard.close();
	}

}
