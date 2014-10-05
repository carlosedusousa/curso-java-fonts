package ces;

//import java.util.Random;

public class semana4exercicio9DadoDoMilhao {

	public static void main(String[] args) {

		int quantidades1[] = new int[6];
		int quantidades2[] = new int[6];

		// Forma 1 - Chama m�todo escrita em outra Classe e j� incrementa no
		// array diretamente.
		for (int i = 0; i < 1000000; i++)

			// jogandoDado-1 � a posi��o que ser� incrementado no vetor de
			// quantidades.
			quantidades1[semana4exercicio8Dado.jogandoDado() - 1]++;

		for (int quantidade : quantidades1) {

			System.out.println("Forma 1 - Total " + quantidade);

		}

		// Forma 2 - Chama m�todo dado() escrita nesta Classe e jogandoDado()
		// escrita em outra Classe
		// e incrementa no array diretamente no primeiro m�todo..
		quantidades2 = dado();

		for (int quantidade : quantidades2) {

			System.out.println("Forma 2 - Total " + quantidade + " Porcentagem "
					+ quantidade / 10000 + "%");

		}

	}

	// M�todo j� existente em outra Classe.
	// public static int jogandoDado() {
	// Random gerador = new Random();
	// return gerador.nextInt(6) + 1;
	// }

	public static int[] dado() {

		// Itera��o come�a em 0 no do-while.
		int umMilhao = 0;

		// Array receber� incrementos para determinar a quantidade de vezes
		// sorteados.
		int sorteados[] = new int[6];

		do {

			// Chama m�todo de outra Classe para sortear o lado do dado.
			switch (semana4exercicio8Dado.jogandoDado()) {

			case 1:
				sorteados[0]++;
				break;
			case 2:
				sorteados[1]++;
				break;
			case 3:
				sorteados[2]++;
				break;
			case 4:
				sorteados[3]++;
				break;
			case 5:
				sorteados[4]++;
				break;
			default:
				sorteados[5]++;
				break;
			}
			umMilhao++;

		} while (umMilhao < 1000000);

		return sorteados;

	}

}