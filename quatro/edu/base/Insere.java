package oo.edu.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Insere {

	public void insere() {
		String nome;
		int idade;

		Scanner k = new Scanner(System.in);

		// Cria um objeto que referencia um arquivo específico
		File arquivo = new File("res/base_pessoas.dat");

		for (int i = 0; i < 5; i++) {

			try {

				// Utilizando o atributo true no construtor o arquivo não será
				// recriado
				FileWriter fw = new FileWriter(arquivo, true);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.newLine(); // cria uma nova linha no arquivo

				// next não permite inserir mais de um espaço assi como o nextLine.
				// Se usar o nextLine, não permitirá salvar a idade na mesma linha 
				// a seguir. Se optar por nextLine, devese mudar a lógica 
				// de salvamento da idade.
				System.out.print("Digite o Nome: ");
				nome = k.next();
				bw.write(nome);

				System.out.print("Informe a idade: ");
				idade = k.nextInt();
				bw.write("|" + idade);

				bw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		k.close();

	}

}
