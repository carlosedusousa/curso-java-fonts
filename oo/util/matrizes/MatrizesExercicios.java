package util.matrizes;

/*
 * 1 - Escreva um método em java para somar todos os números da matriz:
 *
 * 1 | 2 | 4 | 10
 * 3 | 5 | 1 | 6
 * 7 | 3 | 2 | 9
 *
 * Após somar imprima os resultados na tela
 */

/* 2 - Escreva um método em Java para calcular o mínimo, o máximo e a média valor da matriz:
 *
 * 2 | 4 | 5 | 10
 * 6 | 9 | 2 | 1
 * 3 | 4 | 1 | 7
 * 9 | 8 | 4 | 0.3
 *
 *
 * E retorno deve ser um Array de tamanho 3 aonde:
 * - O primeiro valor é o mínimo
 * - O segundo valor é o máximo
 * - O terceiro valor é a média
 */



public class MatrizesExercicios {

	public static void main(String[] args) {

		// Ex 1. Soma todos os valores da matriz.
		int[][] matriz1 = { { 1, 3, 7 }, { 2, 5, 3 }, { 4, 1, 2 }, { 10, 6, 9 } };
		int somatorio = 0;

		for (int i = 0; i < matriz1.length; i++) {
			// matriz1[0].length verifica o tamanho do primeiro 
			// array que é do mesmo tamanho dos outros quanto são matrizes.
			for (int j = 0; j < matriz1[0].length; j++) { 
				somatorio += matriz1[i][j];
			}
		}

		System.out.println("Somatório da matriz: " + somatorio);

		// Ex 2.
		double[][] matriz2 = { { 2, 6, 3, 9 }, { 4, 9, 4, 8 }, { 5, 2, 1, 4 },
				{ 10, 1, 7, 0.3 } };
	
		// Com Chamada de Métodos.
		System.out.println("\nUsando chamada de métodos");
		// Imprime a posição 1 do array da matriz.
		System.out.println("Mínimo " + matrizResultado(matriz2)[0]);
		// Imprime a posição 2 do array da matriz.
		System.out.println("Máximo " + matrizResultado(matriz2)[1]);
		// Imprime a posição 3 do array da matriz.
		System.out.println("Média " + matrizResultado(matriz2)[2]);
		
		// OU imprime todos os valores.
		for(double a : matrizResultado(matriz2)){
			System.out.println(a);
		}
	}

	// Método retorna um array de 3 posições recebendo uma matriz.
	// Percorre-se a matriz e calcula o minimo e o maximo valor.
	// Envia max e min para outro método para calculo da mpedia.
	// retorno array double (recebe matriz de arrays)
	public static double[] matrizResultado(double[][] matrizRecebida) {

		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		double[] resultado = new double[3];
		double soma = 0;

		for (int i = 0; i < matrizRecebida.length; i++) {
			for (int j = 0; j < matrizRecebida.length; j++) {
				menor = Math.min(menor, matrizRecebida[i][j]);
				maior = Math.max(maior, matrizRecebida[i][j]);
				soma += matrizRecebida[i][j];
			}
		}

		resultado[0] = menor;
		resultado[1] = maior;
		//             soma / quantidade de elementos da matriz.
		resultado[2] = soma / (matrizRecebida.length*matrizRecebida[0].length);

		return resultado;

	}
}