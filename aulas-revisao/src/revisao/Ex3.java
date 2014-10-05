package revisao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String resposta;

			System.out.print("O que é o que é que mantém sempre o mesmo tamanho, não importa o peso? :");
			resposta = keyboard.nextLine();
			
		if(resposta.equalsIgnoreCase("balança"))		
		System.out.print("Parabéns, você acertou!");
		else
			System.out.println("Você errou!");

		keyboard.close();
	}
}
