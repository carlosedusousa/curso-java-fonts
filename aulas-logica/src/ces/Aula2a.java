package ces;

public class Aula2a {

	public static void main(String[] args) {
		// Declarando vari�veis
		int valorInt = 10;
		long valorLong = 3000000000L;
		float valorFloat = 400.0f;
		double valorDoable = 400000000000.0;
		
		// Calculo do resultado
		double resultado = (valorInt + valorLong + valorFloat)/valorDoable; // put in brackets to respect maths order.
		
		// Impress�o dos resultados
		System.out.println((valorInt + valorLong + valorFloat)/valorDoable);
		System.out.println(resultado);// 2 ways of solving the exercise.


	}

}
/* Crie uma variavel  int com valorFloat 10, uma long com o valorFloat 3000000000 (9zeros), 
 * uma float com valorFloat 400.02 e uma double com valorFloat 400000000000+.0)
 * 
 * Some as vari�veis do tipo int, long e float e divida o resultado aela vari�vel double
 * 
 * (imprimir)
 * system.out.prinln(<variavel>);
 */