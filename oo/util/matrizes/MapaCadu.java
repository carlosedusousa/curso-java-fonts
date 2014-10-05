package util.matrizes;

import java.util.Random;

/*
 * O Mapa possui 2 atributos:
 * - Dimensão é uma matriz de tamanho definido durante a construção da
 * classe
 * - Obstáculos, são array contendo, N posições [x,y] definidas pelo
 * construtor, tendo como limite as dimensões do mapa.
 *
 * Os obstáculos devem ser gerados assim que o mapa for construído.
 * Não podendo haver um obstáculo do lado do outro.
 *
 * Criar um metodo para verificar a posição é obstáculo ou não retornando booleano.
 *
 */
public class MapaCadu {

	private int[][] dimensao;
	private int[][] obstaculos;

	public MapaCadu(int largura, int altura, int numObstaculos) {
		this.dimensao = new int[largura][altura];
		gerarObstaculos(numObstaculos);
	}

	private void gerarObstaculos(int numObstaculos) {

		this.obstaculos = new int[numObstaculos][2];
		Random gerador = new Random();
		int obs = 0;
		int posicaoValida;
		//int i = 0;
		for (int i = 0; i < numObstaculos; i++) {
			
		//	do{
			posicaoValida = 0;
			do {
				int linha = gerador.nextInt(dimensao.length);
				int coluna = gerador.nextInt(dimensao.length);
				obstaculos[i][0] = linha;
				obstaculos[i][1] = coluna;

				System.out.println(" Sorteado " + (i + 1) + ": " + linha + " "
						+ coluna);

				if (dimensao[linha][coluna] == 0) {
					dimensao[linha][coluna] = 1;

					if (linha != 0) { // Valida primeira linha. Não possui
										// superior.
						dimensao[linha - 1][coluna] = 2;
					}
					if (coluna != 0) { // Valida a primeira coluna. Não possui
										// esquerda.
						dimensao[linha][coluna - 1] = 2;
					}
					if (linha != (dimensao.length - 1)) { // Valida a última
															// coluna. Não
															// possui inferior.
						dimensao[linha + 1][coluna] = 2;
					}
					if (coluna != (dimensao.length - 1)) { // Valida a última
															// coluna. Não
															// possui direita.
						dimensao[linha][coluna + 1] = 2;
					}

					posicaoValida = 1;
					obs += 1;
					System.out.println("Obstaculo " + (i + 1) + ": " + linha
							+ " " + coluna);

				} else if (dimensao[linha][coluna] == 1) {
					posicaoValida = 1;
				}
				if (dimensao[linha][coluna] == 2) {
					posicaoValida = 1;
				}

			} while (posicaoValida != 1);

		}
//			i++;
//			}while (verificaLivre(dimensao) != false);

		System.out.println(" TOTAL DE OBST�?CULO " + obs);
	}

	public boolean verificaLivre(int[][] dimensao) {

		boolean resultado = false;

		for (int i = 0; i < dimensao.length; i++) {
			for (int j = 0; j < dimensao[i].length; j++) {
				if (dimensao[i][j] == 0) {
					resultado = true;
				}
			}
		}
		return resultado;
	}

	public int[][] getDimensao() {
		return dimensao;
	}

	public void setDimensao(int[][] dimensao) {
		this.dimensao = dimensao;
	}

	public int[][] getObstaculos() {
		return obstaculos;
	}

	public void setObstaculos(int[][] obstaculos) {
		this.obstaculos = obstaculos;
	}
}
