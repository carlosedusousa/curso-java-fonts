/* 
 (c)2014|US-UltimateShip.
 Univali - Universidade do Vale do Itajaí.
 GeraçãoTec - Projeto Filnal Batalha Final em JAVA.

 Criadores:
 Alexandre <alexandreess@gmail.com>
 Carlos Eduardo Passos de Sousa <carloseduardosousa@gmail.com>
 Henrique Wilhelm <henrique.wilhelm@gmail.com> 
 Jaison dos santos <jaison1906@gmail.com>
 Otavio Ribeiro <otavioribeiro@capflorianopolis.org.br>
*/

package projeto.descricao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConsultaDescNavy {

	// Classe consulta todos os dados e imprime.
	public void consultaNavy(char p) {

		File arquivo = new File(consultaTipo(p));

		// verifica se o arquivo exite ou não.
		if (arquivo.exists()) {

			try {
				// le o arquivo e imprime cada linha do mesmo no console
				FileReader fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);
				while (br.ready()) {
					System.out.println(br.readLine());
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Arquivo não encontrado");
		}

	}

	public String consultaTipo(char p) {

		String documento = null;

		switch (p) {
		case 'n':
			documento = "src/descricao/perola.dat";
			break;

		case 'd':
			documento = "src/descricao/destroyer.dat";
			break;

		case 's':
			documento = "src/descricao/submarino.dat";
			break;

		case 'c':
			documento = "src/descricao/costa.dat";
			break;

		case 't':
			documento = "src/descricao/titanic.dat";
			break;

		case 'p':
			documento = "src/descricao/plataforma.dat";
			break;

		case 'b':
			documento = "src/descricao/bote.dat";
			break;

		case 'k':
			documento = "src/descricao/canoa.dat";
			break;

		}
		return documento;

	}

}
