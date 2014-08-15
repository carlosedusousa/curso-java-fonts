package edu.dois;

/*
 Ecreva o parcelamento de compra de uma loja. 

 A loja efetua uma venda e o valor da venda é inserida no sistema através do teclado do computador.
 O usuário deve escolher a quantidade de produtos comprados.
 O usuario pode escolher a quantidade que deseja parcelar a compra de 4 a 12 vezes sem juros.
 O sistema deve validar para que o usuário não digite a quantidade de parcelas diferentes do limite estipulado pela loja.
 O sistema imprime na Nota de Compra! Nela estão descritos o Produto e seu respectivo valor,
 o valor Total da compra e as Parcelas numeradas com seu respectivo Valor paracelado.
 A loja está com promoçãoo e dá desconto de 5% para clientes que compram acima de 500 Reais, 
 imprime o valor de desconto na nota caso o cliente efetue a compra acima deste valor.
 A Nota de Compra demonstra valores com 2(duas) casas decimais.
 
 */

import java.util.Scanner;

public class ParacelarCompras {

	public static void main(String[] args) {

		// Instancia variáveis.
		// Variável i usado nos laçoes FOR.
		int i = 0;  
		// Variável de qnatidades de parcelas.
		int quantidade; 
		// Variávels de cálculo de total da compra.
		double total = 0; 
		// Variável de desconto da compra
		double desconto = 0; 
		// Variável que define se a compra superou 500 reais e terá desconto aplicado.
		boolean contemplado = false; 
		
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos que serão inseridas: ");
		quantidade = keyboard.nextInt();
		
		// Instancia array de soma dos produtos inseridos.
		double[] produtos = new double[quantidade];

		// insere os valores e soma o total dos produtos. 
		for (i = 0; i < quantidade; i++) {
			System.out.print("Insira o valor do protuto "+ (i+1) +": ");
			produtos[i] = keyboard.nextDouble();

			// Define a total de notas a serem inseridas
			total += produtos[i];
		}		
		
		// Variável quantidade é reltilizada para calculo do parcelamento das compras.
		quantidade = 0;		
		
		// DO WHILE Laço para validar que o usuário irá parecelar as compras dentro do limite.
		do {
			System.out.println("Escolha a quantidade de Parcelas (4x-12x): ");
			quantidade = keyboard.nextInt();
		} while (quantidade < 4 || quantidade > 12);
		

		// Valida se será aplicado o desconto sobre o total da compra e guarda o valor de desconto.
		if (total >= 500) {
			total *= .95;
			desconto = total * .05;
			contemplado = true;
		}

		// Calcula o valor das parcelas
		double valorParcela = total / quantidade;
		
		// Laço FOR para impressão dos valores dos produtos individualmente.
		for (i = 0; i < produtos.length; i++) {
			System.out.printf("\nProduto %d --------------- %.2f", (i + 1), 
					produtos[i]);
		}
		
		// Se há desconto este é impresso.  
		if (contemplado) {
			System.out.printf("\n\nDescontos --------------- %.2f", desconto);
		}

		// Imprime o total.
		System.out.printf("\nTotal da Compra --------------- %.2f\n", total);
		
		// Imprime as parcelas com laço FOR.
		for (i = 0; i < quantidade; i++) {
			System.out.printf("\nParcela %d --------------- %.2f", (i + 1),
					valorParcela);
		}

		keyboard.close();

	}

}
