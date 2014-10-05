package ces;

import java.util.Random;

public class semana3OrdenarArray {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		// Scanner keyboard = new Scanner(System.in);

		// Cria o arrayOrdenacao arrayOrdenacao de compara��o de tamanho 100.
		int arrayOrdenacao[] = new int[100];
		
		// Carrega o array com dados do usu�rio.
		for (int posicao = 0; posicao < 100; posicao++) {
			 
			int numero = gerandoNumeroDeZeroACem();
			//Instancia o array.
			 arrayOrdenacao[posicao] = numero;
		}

		// Imprime os valores inseridos originalmente.
		System.out.println("\nArray Original: ");
		
		for (int posicao = 0; posicao < 100; posicao++) {
			System.out.print(arrayOrdenacao[posicao] + " | ");
		}

		// Intera��o para verifica��o de todas as posi��es para verificar trocas.
		for (int posicao = 1; posicao <= 100; posicao++) {

			int x = posicao - 1;
			int y = posicao;

			// Enquanto os contadores x e y n�o ultrapassarem o limite de intera��es
			// verifica-se se as posi��es a serem comparadas est�o em ordens trocadas decrescente.
			while (y != 0 && y != 100 && arrayOrdenacao[x] > arrayOrdenacao[y]) {

				// Instancia Tempor�rio para guardar provis�riamente a posi��o a ser trocada.
				int temporario = arrayOrdenacao[x];
				// Troca as posi��es se a cl�usula forem verdadeiras.
				arrayOrdenacao[x] = arrayOrdenacao[y];
				arrayOrdenacao[y] = temporario;
				x--;
				y--;
			}
		}

		// Imprime valores ordenados.
		System.out.println("\nArray Ordenado: ");
		for (int posicao = 0; posicao < 100; posicao++) {
			System.out.print(arrayOrdenacao[posicao] + " | ");
		}

	}

	// M�todo para gerar 100 n�meros.
	public static int gerandoNumeroDeZeroACem() {
		Random gerador = new Random();
		return gerador.nextInt(100) + 1;
	}

}
