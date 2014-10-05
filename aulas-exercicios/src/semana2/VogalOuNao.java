package semana2;

import java.util.Scanner;

public class VogalOuNao {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		String letra = keyboard.next();
		
		if(letra.equalsIgnoreCase("a") || 
			letra.equalsIgnoreCase("e") || 
			letra.equalsIgnoreCase("i") || 
			letra.equalsIgnoreCase("o") ||
			letra.equalsIgnoreCase("u")) {
			
			System.out.println("É vogal.");
		} else {
			System.out.println("É consoante");
		}
		
		keyboard.close();
		
	}
}
