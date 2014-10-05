package util.matrizes;

import java.util.Random;

/*
 * O Mapa possui 2 atributos:
 * - Dimensão é uma matriz de tamanho definido durante a construção da
 * classe
 * - Obstáculos, são array contendo, ? posições [x,y] definidas pelo
 * construtor, tendo como limite as dimensões do mapa.
 *
 * Os obstáculos devem ser gerados assim que o mapa for construído.
 * Não podendo haver um obstáculo do lado do outro.
 *
 * Crie também um método público toString que retorna uma String
 * esse método deve imprimir . (ponto) para localizações com zero,
 * e 0 (zero) para locais com obstáculos.
 *
 */
public class MapaColheDeCha {
	private int[][] dimensao;
	private int[][] obstaculos;
	
	public MapaColheDeCha(int largura, int altura, int numObstaculos) {
		this.dimensao = new int[largura][altura];
		this.obstaculos = new int[numObstaculos][2];
		// .... gerar
		Random gerador = new Random();

		int percorridos = 0;
		while (percorridos < numObstaculos) {
			int x = gerador.nextInt(largura);
			int y = gerador.nextInt(altura);

			if (obstaculoValido(x, y)) {
				this.obstaculos[percorridos][0] = x;
				this.obstaculos[percorridos][1] = y;
				percorridos++;
			}
		}
	}

	private boolean obstaculoValido(int x, int y) {
		int[][] comparacoes = { { 0, 0 }, { -1, -1 }, { -1, 1 }, { 1, -1 },
				{ 1, 1 }, { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

		for (int i = 0; i < this.obstaculos.length; i++) {
			for (int j = 0; j < comparacoes.length; j++) {
				if (j == 0 && x == 0 && y == 0) {
					continue;
				}

				if (obstaculos[i][0] == (comparacoes[j][0] + x)
						&& obstaculos[i][1] == (comparacoes[j][1] + y)) {
					return false;
				}
			}
		}

		return true;
	}
	
	public String toString() {
		
		for (int[] o : this.obstaculos) {
			this.dimensao[o[0]][o[1]] = 1;
		}

		String str = "   ";
		for (int i = 0; i < this.dimensao.length; i++) {
			str += " " + i;
		}
		str += "";

		for (int i = 0; i < this.dimensao.length; i++) {
			str += "\n"+ i + " | ";
			for (int j = 0; j < this.dimensao[0].length; j++) {
				switch (this.dimensao[i][j]) {
				case 0:
					str +=".";
					break;
				case 1:
					str +="0";
					break;
				}
				str +=" "; 
			}
			str +="|";
			
		}
	
		str += "\n\n";
		for (int[] o : this.obstaculos) {
			str += "[" + o[0] + ", " + o[1] + "]\n";
		}

		return str;
	}	
}