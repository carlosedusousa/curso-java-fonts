package ces;

import java.util.Scanner;

public class CalculaImposto {

	public static void main(String[] args) {
		// Instancia um objeto do tipo Scanner que serve
		// para ler dados a partir do teclado.
		Scanner keyboard = new Scanner(System.in);
		
		// Instancia Vari�veis
		System.out.println("Digite o valor da nota fiscal.");
		double valorNotaFiscal = Double.parseDouble(keyboard.nextLine());
		double valorDoImposto;

		// Compara valores das vari�veis com as m�tricas atribuidas
		if (valorNotaFiscal < 1000.60)
			valorDoImposto = valorNotaFiscal * (25.0 / 100.0);
		else if (valorNotaFiscal > 1000.60 && valorNotaFiscal < 4500.23)
			valorDoImposto = valorNotaFiscal * (22.0 / 100.0);
		else
			valorDoImposto = valorNotaFiscal * (18.0 / 100.0);

		// Imprime resultados da nota, imposto e recebido.
		System.out.println("Valor da nota: " + valorNotaFiscal);
		System.out.println("Valor do imposto: " + valorDoImposto);
		System.out.println("Valor recebido pelo emissor: " + (valorNotaFiscal - valorDoImposto));

		keyboard.close();
	}
}
