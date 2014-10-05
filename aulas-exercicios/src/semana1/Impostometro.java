package semana1;

public class Impostometro {

	public static void main(String[] args) {
		double nota = 4500.23;
		double valorTotalNota;
		double imposto = 0.0;
		
		if(nota < 1000.60) {
			imposto = 0.25;
		}
		
		if(nota >= 1000.60) {
			if(nota <= 4500.23) {
				imposto = 0.22;
			}
		}
		
		if(nota > 4500.23) {
			imposto = 0.18;
		}

		valorTotalNota = nota - (nota * imposto);
		
//		System.out.println("O valor que o emissor pagou " + (imposto*100) + "% "
//				+ "de imposto e o valor irá receber será de: R$"
//				+ valorTotalNota);
		System.out.println(String.format("O valor que o emissor pagou %.0f%%\n"
				+ "de imposto e o valor irá receber será de: R$%.2f\n"
				+ "ele perdeu no total: R$%.2f para o governo.", 
				(imposto*100), valorTotalNota, (imposto * nota)));
	}

}
