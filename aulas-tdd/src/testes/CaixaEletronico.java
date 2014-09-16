package testes;

//Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em 
//um caixa eletrônico. Os requisitos básicos são os seguintes:
//
//- Entregar o menor número de notas;
//- É possível sacar o valor solicitado com as notas disponíveis;
//- Saldo do cliente infinito;
//- Quantidade de notas infinito (pode-se colocar um valor finito de cédulas para aumentar 
//dificuldade do problema);
//- Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00
//
//Exemplos:
//- Valor do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
//- Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.

public class CaixaEletronico {
	public int[] saque(int valor) throws Exception {
		int[] notas = new int[4];
		// Caso o valor não for multiplo de dez 
		// quer dizer que ele não pode ser dividido pelos valores desejados.
		// Retorna uma exceção.
		if (valor % 10 > 0) {
			throw new Exception("O caixa não possui as notas que você deseja");
		}
		// Enquanto há valores superiores a zero será decrementado a nota respectiva.
		while (valor != 0) {
			// Se nota é divisível por cem o array na posicao receberá a quantidade. 
			if (valor / 100 > 0) {
				// posicao zero recebe a quantidade de notas de Cem
				notas[0] = valor / 100;
				valor -= (valor / 100) * 100;
			}
			// Se nota é divisível por cinquenta o array na posicao receberá a quantidade.
			if (valor / 50 > 0) {
				// posicao um recebe a quantidade de notas de Cinquenta
				notas[1] = valor / 50;
				valor -= (valor / 50) * 50;
			}
			// Se nota é divisível por vinte o array na posicao receberá a quantidade.
			if (valor / 20 > 0) {
				// posicao dois recebe a quantidade de notas de Vinte
				notas[2] = valor / 20;
				valor -= (valor / 20) * 20;
			}
			// Se nota é divisível por dez o array na posicao receberá a quantidade.
			if (valor / 10 > 0) {
				// posicao 3 recebe a quantidade de notas de Dez
				notas[3] = valor / 10;
				valor -= (valor / 10) * 10;
			}
		}
		// Ao final retorna-se o array de notas.
		return notas;
	}
}