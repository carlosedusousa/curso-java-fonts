package revisao;


public class RevisaoLogica {

	public static int potencia(int numero) {
		return (int) Math.pow(numero, 3);
	}

	public static double imc(double altura, double peso) {
		return (peso / Math.pow(altura, 2));
	}

	public static double multa(double valor) {
		return ((valor <= 50) ? 0 : ((valor - 50) * 4));
	}

	public static String nadadores(int valor) {

		if (valor >= 5 && valor <= 7)
			return "Infantil A";
		if (valor >= 8 && valor <= 11)
			return "Infantil B";
		if (valor >= 12 && valor <= 13)
			return "Juvenil A";
		if (valor >= 14 && valor <= 17)
			return "Juvenil B";
		if (valor > 18)
			return "Adultos";
		return null;
	}

	public static int maiores(int... numeros) {

		int maior = 0;

		for (int numero : numeros) {
			if (numero >= maior)
				maior = numero;
		}

		return maior;

	}

	public static double mongePilantra() {
		double resultado = 0;

		for (int i = 0; i < 64; i++)
			resultado += Math.pow(2, i);

		return resultado;

	}

}