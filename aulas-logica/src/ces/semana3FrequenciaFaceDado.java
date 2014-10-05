//3 - Escreva um programa que calcule e apresente a frequ�ncia de sa�da de cada face de um dado, 
//lan�ado 6000 vezes consecutivas. 
//A frequ�ncia de sa�da de cada face deve ser armazenada num array e apresentada no final.
package ces;

import java.util.Random;

public class semana3FrequenciaFaceDado {

	public static void main(String[] args) {
		
		// cria o arrayFaceDado array de compara��o
		int arrayFaceDado[] = new int[6];

		int face = -1;
		int i = 0;

		do {
			Random gerador = new Random();
			face = gerador.nextInt(6) + 1;

			// Cada posi��o do array recebe o incremendo da face sorteada.
			if (face == 1) {
				arrayFaceDado[0]++;

			} else if (face == 2) {
				arrayFaceDado[1]++;

			} else if (face == 3) {
				arrayFaceDado[2]++;

			} else if (face == 4) {
				arrayFaceDado[3]++;

			} else if (face == 5) {
				arrayFaceDado[4]++;

			} else {
				arrayFaceDado[5]++;
			}

			i++;

		} while (i < 6000);

		for (int x = 0; x < 6; x++) {

			System.out.println("Face " + x + " teve frequ�ncia de "
					+ arrayFaceDado[x] + " vezes em 6000!");

		}

	}

}
