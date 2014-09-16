package testes;
/*
Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três
possíveis itens: Pedra, Papel ou Tesoura.
O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa
o resultado da partida. As regras são as seguintes:
- Pedra empata com Pedra e ganha de Tesoura
- Tesoura empata com Tesoura e ganha de Papel
- Papel empata com Papel e ganha de Pedra
*/

public class Jokenpo {
	public static String jogar(String eu, String vc) throws Exception {
		if (!(eu.equals("pedra") || eu.equals("papel") || eu.equals("tesoura"))
				|| !(vc.equals("pedra") || vc.equals("papel") || vc
						.equals("tesoura"))) {
			throw new Exception("Erro nas alternativas");
		}
		if (eu.equals("pedra")) {
			if (vc.equals("tesoura")) {
				return "vitoria";
			}
			if (vc.equals("papel")) {
				return "derrota";
			}
		}
		if (eu.equals("tesoura")) {
			if (vc.equals("papel")) {
				return "vitoria";
			}
			if (vc.equals("pedra")) {
				return "derrota";
			}
		}
		if (eu.equals("papel")) {
			if (vc.equals("pedra")) {
				return "vitoria";
			}
			if (vc.equals("tesoura")) {
				return "derrota";
			}
		}
		return "empate";
	}
}