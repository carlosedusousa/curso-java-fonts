package util.matrizes;

import java.util.Scanner;

/*
 * 3 - Crie um método que terá uma matriz para armazenar o nome e o e-mail de contatos.
 *
 * - O usuário poderá indicar quantos contatos deseja registrar.
 * - Este número deve ser maior que zero.
 * - O usuário poderá registrar um número menor de contatos.
 * - Utilize um laço for para captar e armazenar os dados.
 * - Utilize laços while para captar o nome e o e-mail.
 * Se um dado informado não for válido, solicite-o novamente:
 * - Nome: de 2 a 50 caracteres
 * - E-mail: de 5 a 50 caracteres
 *
 * Utilize um laço for para recuperar e exibir a lista de contatos.
 */

public class Contatos {

	public static void main(String[] args) {
		int quantidade = 0;

		Scanner k = new Scanner(System.in);

		do {
			System.out.println("Informe a quantidade de inserções: ");
			quantidade = k.nextInt();
		} while (quantidade < 1);

		String[][] contatos = new String[quantidade][2];

		// Matriz inicializada com valores null.
		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("[" + i + "] [" + j + "]"
						+ (j == 0 ? " nome   : " : " e-mail : ")
						+ contatos[i][j]);

			}

		}

		for (int i = 0; i < quantidade; i++) {

//			while (contatos[i][0].equals(null)) {
				System.out.println("Informe o nome: ");
				contatos[i][0] = k.nextLine();
//			}

			// while (!contatos[i][0].equals(null)) {
			// System.out.println("Informe o e-mail: ");
			// contatos[i][1] = k.nextLine();
			// }
		}

		k.close();

	}

	public static String[][] contatos(String[][] contato) {
		String[][] contatos = new String[10][2];

		return contatos;

	}

}
