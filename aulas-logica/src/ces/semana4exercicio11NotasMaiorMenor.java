package ces;

import java.util.Scanner;

public class semana4exercicio11NotasMaiorMenor {

	public static void main(String[] args) {

		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Digite a Primeira nota: ");
		double a = keyboard.nextFloat();

		System.out.print("Digite a Segunda nota: ");
		double b = keyboard.nextFloat();

		System.out.print("Digite a Terceira nota: ");
		double c = keyboard.nextFloat();

		//Imprime a m�dia das notas passando todas as notas.
		System.out.printf("\nM�dia de todas as notas �  %.2f",
				 			calculaMedia(a, b, c));
		// System.out.println("M�dia de todas as notas � "
		// + mediaTotal(a , b , c));

		//Imprime a m�dia das notas maior com a menor.
		System.out.printf("\nM�dia da maior com a menor nota � %.2f",
							calculaMedia(maior(a, b, c), menor(a, b, c)));
		// System.out.println("M�dia da maior com a menor nota � "
		// + mediaMaiorMenor(a , b , c));

		//Imprime a m�dia das notas passando as maiores notas.
		System.out.printf("\nM�dia das maiores notas �  %.2f",
							mediaNotasMaiores(a, b, c));

		//Imprime a maior notas.
		System.out.printf("\nMaior nota �  %.2f", 
							maior(a, b, c));

		//Imprime a menor notas.
		System.out.printf("\nMenor nota �  %.2f",
							menor(a, b, c));

		keyboard.close();

	}

	// M�todo que retorna o maior n�mero de 3 comparados.
	public static double maior(double a, double b, double c) {

		return Math.max(a, Math.max(b, c));

	}

	// M�todo que retorna o menor n�mero de 3 comparados.
	public static double menor(double a, double b, double c) {

		return Math.min(a, Math.min(b, c));

	}

	// M�todo gen�rico para calcular m�dia Total.
	public static double calculaMedia(double... notas) {
		double somatorio = 0;
		for (double nota : notas) {
			somatorio += nota;
		}

		return somatorio /= notas.length;

	}

	// M�todo que retorna a m�dia das maiores notas.
	public static double mediaNotasMaiores(double a, double b, double c) {

		//Verifica qual a menor nota e exclui do c�lculo da m�dia.
		//Chama o m�todo passando os dois maiores valores.
		if (menor(a, b, c) == a) {
			return calculaMedia(b, c);

		} else if (menor(a, b, c) == b) {
			return calculaMedia(a, c);

		} else {
			return calculaMedia(a, b);
		}

	}

	// M�todo que retorna a m�dia de todas as notas.
//	public static double mediaTotal(double a, double b, double c) {
//
//		return (a + b + c) / 3;
//
//	}

	// M�todo que retorna a m�dia da maior com a menor notas.
//	public static double mediaMaiorMenor(double a, double b, double c) {
//
//		return (maior(a, b, c) + menor(a, b, c)) / 2;
//
//	}


}
