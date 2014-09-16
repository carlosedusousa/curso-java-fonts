package testes;

import java.util.Scanner;

public class CaixaEletronicoMain {

	public static void main(String[] args) throws Exception {

		// Scanener lê o valor a sacar!
		Scanner cx = new Scanner(System.in);
		System.out.print("Informe o valor do saque: ");
		// valor tipo int recebe a quantia desejada.
		int valor = cx.nextInt();

		// Objeto caixa receberá as quantias de cada nota retornada pelo método.
		CaixaEletronico caixa = new CaixaEletronico();

		// Array int recebe os valores que serão impressos abaixo 
		// com os valores respectivos 
		int[] resultado = caixa.saque(valor);

		System.out.println("Número de cédulas de 100 = " + resultado[0]);
		System.out.println("Número de cédulas de 50 = " + resultado[1]);
		System.out.println("Número de cédulas de 20 = " + resultado[2]);
		System.out.println("Número de cédulas de 10 = " + resultado[3]);

		cx.close();
	}

}