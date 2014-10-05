package lacos.tarefas;

/*
 * O for-each é uma simplicação do uso do for.
 * Ele é utilizado para iterar entre dados de uma Coleção (como as Arrays)
 */

public class ForEach {

	public static void main(String[] args) {
		// Inicializa um array de nomes
		String[] nomes = { "Nassor", "Lueji", "Tulani" };

		// Itera entre cada um desses nomes
		for (String nome : nomes) {
			System.out.println(nome);
		}

		// Mesma coisa que o for acima
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

		double[] notas = { 8.6, 3.3, 10.0, 4.4 };
		double somaNotas = 0.0;

		for (double nota : notas) {
			somaNotas += nota;
		}

		// Mesma coisa
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

		System.out.printf("A média é %f.", (somaNotas / notas.length));

	}

}
