package semana5;

public class ChamadaPrincipal {

	public static void main(String[] args) {

		double nota1 = 9.4;
		double nota2 = 5.4;
		double nota3 = 7.4;
		double nota4 = 2.4;

		MediaComVariasNotas mediaNotas = new MediaComVariasNotas();
		RetornaMaiorOuMenorDeTres menor = new RetornaMaiorOuMenorDeTres();
		RetornaMaiorOuMenorDeTres maior = new RetornaMaiorOuMenorDeTres();
		RetornaMaiorOuMenorDeTres maioresNotas = new RetornaMaiorOuMenorDeTres();
		MetodosComParametrosInfinitos arrayNumeros = new MetodosComParametrosInfinitos();

		// Imprimindo valores na tela com chamada dos m�todos de outras Classes.

		System.out.printf("\nM�dia das notas %.2f ",
				mediaNotas.calculaMedia(1, 3, 5, 8, 9));
		System.out.println("\nTotal da Soma: "
				+ arrayNumeros.somaInteiros(10, 10, 40, 76, 43));
		int[] numeros = { 10, 10, 32, 45, 323, 534, 66, 87 };
		System.out.println("\nTotal da Soma: "
				+ arrayNumeros.somaInteirosArray(numeros));
		System.out.println("\nMaior " + maior.maiorDeTres(2, 3, 1));
		System.out.println("\nMenor " + menor.menorDeTres(2, 3, 1));

		// M�dia da maior com a menor nota.
		System.out.printf(
				"\nM�dia da maior com a menor nota %.2f: ",
				mediaNotas.calculaMedia(maior.maiorDeTres(1, 2, 3),
						menor.menorDeTres(1, 2, 3)));

		System.out.printf("\nM�dia de varias notas: %.2f ", mediaNotas
				.calculaMedia(maioresNotas.maioresNotas(nota1, nota2, nota3, nota4)));
	}

}
