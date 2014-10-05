package metodos.corrigidos;

/*
 * Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes 
 * de uma equação do segundo grau e retorne o valor do delta, que é dado por 'b² - 4ac'
 */
public class EquacaoSegundo {

	public static void main(String[] args) {
		System.out.println(Delta(1, 5, 2));
		System.out.println(Delta(1, 2, 4));
		System.out.println(Delta(1, 3, 5));
		System.out.println(Delta(3, 4, 6));
		System.out.println(Delta(1, 3, 1));
		System.out.println(Delta(1, 6, 3));
		System.out.println(Delta(1, 9, 5));
		System.out.println(Delta(2, 1.3, 7)); // utilização do método sobrecarregado
	}
	
	public static int Delta(int a, int b, int c) {
		return b*b - 4 * a * c;
	}
	
	// Sobrecarga do método Delta
	public static double Delta(double a, double b, double c) {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	

}
