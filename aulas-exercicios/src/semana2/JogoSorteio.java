package semana2;

import java.util.Random;
import java.util.Scanner;

public class JogoSorteio {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int numeroSorteado = gerador.nextInt(100) + 1;
		int numeroDigitado;
		int contador = 0;
		
		do {
			System.out.print("Tente acertar o numero: ");
			numeroDigitado = keyboard.nextInt();
			
			contador++;
			
			if(numeroDigitado > numeroSorteado) {
				System.out.println("O número que você procura é menor "
						+ "que " + numeroDigitado);
			}
			
			if(numeroDigitado < numeroSorteado) {
				System.out.println("O número que você procura é maior "
						+ "que " + numeroDigitado);
			}
			
			
		} while(numeroSorteado != numeroDigitado);
		
		System.out.println("Você acertou após " + contador + " tentativas!");

		keyboard.close();
	}

}
