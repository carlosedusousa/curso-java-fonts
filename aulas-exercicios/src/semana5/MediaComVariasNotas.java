package semana5;

public class MediaComVariasNotas {

	public double calculaMedia(double... notas) {
		double somatorio = 0;
		for (double nota : notas) {
			somatorio += nota;
		}

		return somatorio /= notas.length;

	}

}
