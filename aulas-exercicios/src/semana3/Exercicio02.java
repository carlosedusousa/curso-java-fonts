package semana3;

public class Exercicio02 {

	public static void main(String[] args) {
		// criando um array, já atribuindo valores a ele.
		double[] a = {0.4, 1.4, 3.2, 2.55555, 10.4, 3.1};
	
		// imprimindo todos os numeros
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		// Quebrando a linha
		System.out.println();
		
		//(BONUS: apenas 2 casas depois da vírgula)
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%.2f ", a[i]);
		}
	}
		
}
