package metodos.corrigidos;

import java.util.Scanner;

public class EhPositivo {

	/*
	 * Crie um método que receba um valor e informe se ele é positivo ou negativo 
	 * através de um retorno com boolean. Execute o programa enquanto a letra 'e'
	 * não for digitada.
	 * 
	 * Declare como: boolean isPositive(float num)
	 */
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		while(true) {
			System.out.print("Escreva um número ('e' para sair): ");
			String valorDigitado = k.next();
			
			if(valorDigitado.equals("e")) {
				break;
			}
			
			float numero = Float.parseFloat(valorDigitado);
			
			boolean resultadoPositivo = isPositive(numero);
			System.out.println(resultadoPositivo ? "positivo" : "negativo");
			
			boolean resultadoZero = isZero(numero);
			System.out.println(resultadoZero);
		}
		
		k.close();
	}
	
	/*
	 * Crie um método que receba um valor e diga se é nulo ou não.
	 * Declare como: boolean isZero(float num)
	 */
	
	public static boolean isZero(float num) {
		return num == 0.0f;
	}
	
	public static boolean isPositive(float num) {
		return num >= 0;
	}

}












