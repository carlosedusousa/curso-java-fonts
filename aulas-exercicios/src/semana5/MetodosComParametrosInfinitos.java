package semana5;

public class MetodosComParametrosInfinitos {

	public double somaDoisInteiros(double a, double b) {
		return a + b;
	}

	// Array de tamanho infinito
	public int somaInteiros(int... numeros) {
		System.out.println("Array de tamanho: " + numeros.length);
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}

		return soma;

	}

	// Array de tamanho finito
	public int somaInteirosArray(int[] numeros) {
		System.out.println("Array de tamanho: " + numeros.length);
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}

		return soma;

	}

}
