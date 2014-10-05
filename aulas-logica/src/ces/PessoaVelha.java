package ces;

import java.util.Scanner;

public class PessoaVelha {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.		
		Scanner keyboard = new Scanner(System.in);

		// Instancia a idade
		System.out.println("Qual a sua idade?");
		int idade = Integer.parseInt(keyboard.nextLine());

		// Verifica se idade � maior que a indicada e imprime , sen�o finaliza o programa
		if (idade > 150)
			System.out.println("Voc� j� esta fazendo hora extra");
		keyboard.close();
	}

}
