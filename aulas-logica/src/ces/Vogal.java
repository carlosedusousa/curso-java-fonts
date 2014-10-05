package ces;

import java.util.Scanner;

public class Vogal {
	
	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.		
		Scanner keyboard = new Scanner(System.in);
		
		// L� letra digitada peslo usu�rio
		System.out.println("Digite a Letra: ");
		String Letra = keyboard.next();
		
		// Compara a letra digitada com as vogais ignorando caso sencitivo
		if(
			Letra.equalsIgnoreCase("a") ||
			Letra.equalsIgnoreCase("e") ||
			Letra.equalsIgnoreCase("i") ||
			Letra.equalsIgnoreCase("o") ||
			Letra.equalsIgnoreCase("u")				
		){
			// Imprime valores
		    System.out.println("A letra " + Letra + " � uma Vogal" );
		}else{
			System.out.println("A letra " + Letra + "� uma Consoante" );
		}
		
		keyboard.close();
	}

}
