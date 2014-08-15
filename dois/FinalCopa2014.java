package edu.dois;

/*

 Simule a Final da Copa 2014 para os 4 melhores times que disputam o Título Mundial.
 Simule a dispulta do primeiro e segundo lugar (Claro, Brasil na final e o melhor candidado a confronto será Argentina).
 Simule a dispulta do terceiro e quarto lugar (Aqui você pode testar com a Alemanha e Holanda!).
 O time que começa a fazer gols será o mesmo time que ganha no cara e coroa. Depois o outro time faz os gols.
 O resultado dos gols é gerado por Randon assim como o cara e coroa.
 Os times podem fazer até 4 gols cada e nessa rodada FINAL não é possível haver empates!
 Imprima os resultados dos confrontos dos jogos. TIME1 GOLS1 X TIME2 GOLS2 e TIME3 GOLS3 X TIME4 GOLS4
 Não esqueça de imprimir "O TIMECAMPEAO É CAMPEÃO MUNDIAL DE FULTEBOL 2014!"

*/

import java.util.Random;

public class FinalCopa2014 {

	public static void main(String[] args) {

		// Variável Boolean que define o fim dos jogos da final.
		boolean fimDoJogo = true;
		// Array de String para guardar os nomes dos times.
		String[] time = new String[4];
		// Array de inteiros que guarda a quantidade de gols feitos pelos times.
		// Cada posisão do array de inteiros será o mesmo da do string, exemplo
		// time[0] e gols[0] ...
		int[] gols = new int[4];
		// Inteiro que define a posiãoo dos times nos arrays.
		int i = 0;

		// Inicializando o Array de string com os nomes dos times e suas
		// posições.
		time[0] = "Brasil";
		time[1] = "Argentina";
		time[2] = "Alemanha";
		time[3] = "Holanda";

		// do-while para gerar dois jogos.
		do {

			// Como i é inicializado em 0 o primeiro jogo inicializa,
			// caso receba 2 o segundo jogo é inicializado.
			if (i == 2) {
				fimDoJogo = false;
			}

			// Inicializa o objeto gerador Random.
			Random gerador = new Random();

			// Variável que define quem começa o jogo e faz os gols.
			int caraCoroa = gerador.nextInt(2) + 1;

			// Se 1 será o time com menor posição de seu oponente no Array de
			// String.
			if (caraCoroa == 1) {
				gols[i] = gerador.nextInt(4) + 1;

				// Laço DO para sortear gols diferente do gerado pelo primeiro
				// time que ganhou o cara e coroa.
				// time. Não pode haver empate.
				do {
					gols[i + 1] = gerador.nextInt(4) + 1;
				} while (gols[i] == gols[i + 1]);

				// Se 2, será o time posterior ao da posição de seu oponente no
				// Array de String.
			} else {
				gols[i + 1] = gerador.nextInt(4) + 1;

				// Laço DO para sortear gols diferente do gerado pelo primeiro
				// time que ganhou o cara e coroa.
				do {
					gols[i] = gerador.nextInt(4) + 1;
				} while (gols[i + 1] == gols[i]);

			}

			// Imprime os Resultados.
			System.out.println(time[i] + " " + gols[i] 
					         + " X " 
					         + time[i + 1] + " " + gols[i + 1]);

			// Após o primeiro jogo i recebe 2 para iniciar o segundo jogo e
			// fimDoJogo ser decretado após sua execução.
			i = 2;

		} while (fimDoJogo);

		// Ternário para atribuir valor 0 ou 1 para o time do primeiro jogo que
		// fez mais gols.
		// O time com mais gol obviamente é o Campeão da Copa do Mundo de 2014.
		i = (gols[0] > gols[1]) ? 0 : 1;
		System.out.println(time[i].toUpperCase()
				+ " É CAMPEÃO MUNDIAL DE FULTEBOL 2014");
	}

}
