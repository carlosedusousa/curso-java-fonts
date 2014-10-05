/* 
 (c)2014| Carlos Eduardo Passos de Sousa <carloseduardosousa@gmail.com>
 */

package oo.estatico.exercicios;

public class HashCode {

	public static void main(String[] args) {

		// Contas são diferentes.
		Conta conta0 = new Conta(100, "Nassor");
		Conta conta1 = new Conta(100, "Nassor");

		// Contas iguais.
		// Conta conta0 = new Conta(100, "Nassor");
		// Conta conta1=conta0;

		if (conta1.equals(conta0))
			System.out.println("Contas iguais");
		else
			System.out.println("Contas não iguais");

		// if(conta0.hashCode() == conta1.hashCode())
		if (conta0.hashCode() == conta1.hashCode())
			System.out.println("Contas iguais");
		else
			System.out.println("Contas não iguais");

		String teste = "mimimi";
		String teste2 = "mimimi";

		if (teste.hashCode() == teste2.hashCode())
			System.out.println("iguais");
		else
			System.out.println("não iguais");

	}
}
