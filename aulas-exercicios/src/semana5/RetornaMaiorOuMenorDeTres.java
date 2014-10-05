package semana5;

import java.util.Arrays;

public class RetornaMaiorOuMenorDeTres {

	// Retorna o Maior n�mero.
	public double maiorDeTres(double... numeros) {

		return Math.max(numeros[0], Math.max(numeros[1], numeros[2]));

	}
	
	//Retorna o Menor n�mero.
	public double menorDeTres(double... numeros) {

		return Math.min(numeros[0], Math.min(numeros[1], numeros[2]));

	}
	
	// Retorna array com as maiores notas e excluindo a menor de todas.
	public double[] maioresNotas(double... notas) {
		
		//double[] maiores = new double[notas.length -1];
		
		Arrays.sort(notas);
		
		// Outra forma - Faz uma c�pia do array iniciando na posi��o X.
		return Arrays.copyOfRange(notas, 1,notas.length);
		
//		for(int i=1; i<notas.length; i++){
//			maiores[i - 1] = notas[i];
//		}
//		
//		return maiores;
		
	}

}
