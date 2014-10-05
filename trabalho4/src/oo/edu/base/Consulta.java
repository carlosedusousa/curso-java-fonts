// (c)2014|carlosedusousa.

package oo.edu.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Consulta {

	// Classe consulta todos os dados e imprime.
	public void consultaAll() {
		File arquivo = new File("res/base_pessoas.dat");

		// verifica se o arquivo exite ou não.
		if (arquivo.exists()) {
			
			try {

				System.out.println("Consultando todos os arquivos...");
				// le o arquivo e imprime cada linha do mesmo no console
				FileReader fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);
				while (br.ready()) {

					String linha = br.readLine();

					// Se a linha está vazia, linha recebe próximo.
					while (linha.trim().length() == 0) {
						linha = br.readLine();
					}

					// Da posição 0 até encontrar a tag pipe 
					// retorna a posição do nome.
					String nome = linha.substring(0, linha.lastIndexOf('|'));
					
					// Da posição após a tag pipe ao final da linha 
					// retorna a posição da idade.					
					String idade = linha.substring(linha.lastIndexOf('|') + 1,
							linha.length());

					// Imprime dados encontrados.
					System.out.println("Nome: " + nome + " Idade: " + idade);

				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Arquivo não encontrado");
		}

	}

	public void consulta18() {
		File arquivo = new File("res/base_pessoas.dat");

		// verifica se o arquivo exite ou não
		if (arquivo.exists()) {
			try {

				System.out.println("Consultando Maiores de 18 anos...");
				// le o arquivo e imprime cada linha do mesmo no console
				FileReader fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);

				while (br.ready()) {

					String linha = br.readLine();

					// Se a linha está vazia, linha recebe próximo.
					while (linha.trim().length() == 0) {
						linha = br.readLine();
					}

					// Da posição após a tag pipe ao final da linha 
					// retorna a posição da idade.					
					String idade = linha.substring(linha.lastIndexOf('|') + 1,
							linha.length());

					// Verifica a maioridade.
					if (Integer.parseInt(idade) >= 18) {

						// Da posição 0 até encontrar a tag pipe 
						// retorna a posição do nome.
						String nome = linha
								.substring(0, linha.lastIndexOf('|'));

						// Imprime dados encontrados.
						System.out
								.println("Nome: " + nome + " Idade: " + idade);
					}

				}
				br.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Arquivo não encontrado");
		}
	}

	public void consultaNomeComALetra(char c) {
		
		int i = 0;// contador de pesquisa.
		
		File arquivo = new File("res/base_pessoas.dat");

		// verifica se o arquivo exite ou não
		if (arquivo.exists()) {
			try {

				System.out.println("Consultando dados com a letra ("+ c +")...");
				// le o arquivo e imprime cada linha do mesmo no console
				FileReader fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);
				while (br.ready()) {

					String linha = br.readLine();

					// Se a linha está vazia, linha recebe próximo.
					while (linha.trim().length() == 0) {
						linha = br.readLine();
					}

					// Verifica se a linha começa com a letra consultada.
					// Que é a posição do nome.
					if (linha.charAt(0) == c) {
						
						i++; // se encontrou, intera o contador.

						// Da posição 0 até encontrar a tag pipe 
						// retorna a posição do nome.
						String nome = linha
								.substring(0, linha.lastIndexOf('|'));
						String idade = linha.substring(
								linha.lastIndexOf('|') + 1, linha.length());

						// Imprime dados encontrados. 
						System.out
								.println("Nome: " + nome + " Idade: " + idade);
					}
				}
				
				// Verifica se não houve dados encontrados e imprime 
				if(i == 0){
					System.out.println("A consulta não retornou nenhum resultado.");
				}
				
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Arquivo não encontrado");
		}

	}
}
