package ces;

import java.util.Random;

public class semana4exercicio8Dado {

	public static void main(String[] args) {
		// Imprime chamando o m�todo que retornar� o lado sorteado.
		System.out.println(jogandoDado());

	}

	// M�todo de sorteio de lados de um dado lan�ado.
	public static int jogandoDado() {
		Random gerador = new Random();
		return gerador.nextInt(6) + 1;
	}

}
