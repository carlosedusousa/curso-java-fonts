package edu.dois;

/*
 
 Você é um PROMOTER de festas e até as 18h de hoje você deverá ... 
 fechar e imprimir a sua LISTA BONUS para a boate!
 Através do teclado, digite (uma lista de Nomes) enquanto quiser inserir novos Nomes 
 e os imprima na tela. 
 Digite "sair" para finalizar a Lista.

*/


import java.util.Scanner;

public class ListaAlfabetica {

	public static void main(String[] args) {

		// Instancia uma lista de nomes que serão concatenadas com nomes enquanto inseridos.
		String listaDeNomes = "";
		// Instancia um nome a ser concatenado.
		String nome = "";

		// Instancia o objeto scanner para leitura dos dados inseridos. 
		Scanner keyboard = new Scanner(System.in);

		// WHILE enquanto nome diferente de "sair" os nomes serão concatenados.
		while (!nome.equals("sair")) {
			System.out.print("Digite o nome: ");
			nome = keyboard.nextLine();

			if (!nome.equals("sair"))
				// Concatenando nomes com "\n" que servirá com quebra de linha na impressão.
				listaDeNomes = listaDeNomes.concat(nome + "\n");

		}

		// Impressão dos nomes.
		System.out.println("\nNOMES QUE ESTÃO NA LISTA BONUS");
		System.out.println(listaDeNomes);

		keyboard.close();
	}

}
