// (c)2014|carlosedusousa.

package edu.um;

public class Condicionais {

	// M�todo que verifica se valores s�o divis�veis por 5 e retorna um booleano.
	public static boolean divisivelCinco(double numero) {
		return ((numero % 5 == 0) ? true : false);
	}

	// M�todo que verifica a idade para um doador de sangue.
	public static boolean eDoador(int idade) {
		return ((idade >= 18 && idade <= 67) ? true : false);
	}

	// M�todo que verifica se o ano � bissexto.
	public static boolean bissexto(int ano) {
		return ((((ano % 400) == 0) || ((ano % 4) == 0 && (ano % 100) != 0)) ? true : false);
	}

	public static void main(String[] args) {

		// Crie um método que que verifiquei se um número é divisível por 5
		// ou
		// não.
		// ele deve se chamar divisivelCinco e ter com parametro número double
		// e
		// deve
		// retornar true (para divisível) ou false (para não divisível)
		Valores_Main.correcao(divisivelCinco(5), true);
		Valores_Main.correcao(divisivelCinco(6), false);
		Valores_Main.correcao(divisivelCinco(55), true);
		Valores_Main.correcao(divisivelCinco(15), true);
		Valores_Main.correcao(divisivelCinco(85), true);
		Valores_Main.correcao(divisivelCinco(83), false);

		// Para doar sangue é necessário ter entre 18 e 67 anos.
		// Crie um método chamado chamado eDoador que recebe a idade como
		// parametro.
		// Retorne se uma pessoa pode ou não doar sangue (true ou false)
		Valores_Main.correcao(eDoador(5), false);
		Valores_Main.correcao(eDoador(25), true);
		Valores_Main.correcao(eDoador(33), true);
		Valores_Main.correcao(eDoador(68), false);
		Valores_Main.correcao(eDoador(18), true);
		Valores_Main.correcao(eDoador(67), true);
		Valores_Main.correcao(eDoador(44), true);
		Valores_Main.correcao(eDoador(90), false);
		Valores_Main.correcao(eDoador(11), false);
		Valores_Main.correcao(eDoador(55), true);

		// Crie um método que verifique se um ano é bissexto ou não.
		// Chame o método de bissexto ele recebe o ano como parametro e retorna
		// true para anos bissextos
		// e false para anos não bissextos.
		int[] anosBissextos = { 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016,
				2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 400, 800,
				1200, 1704, 2000, 2400 };

		int[] anosNaoBissextos = { 500, 600, 1500, 1800, 1900, 2100, 2200, 2300 };

		for (int ano : anosBissextos) {
			Valores_Main.correcao(bissexto(ano), true);
		}

		for (int ano : anosNaoBissextos) {
			Valores_Main.correcao(bissexto(ano), false);
		}
	}
}
