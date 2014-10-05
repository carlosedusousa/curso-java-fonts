package semana1;

import java.util.Scanner;

class Programa {
	public static void main(String[] args) {
		int n, c, d, swap;

		Scanner in = new Scanner(System.in);
		System.out
				.println("Entre a Quantidade de Numeros Inteiros a Processar:");
		n = in.nextInt();
		int array[] = new int[n];
		System.out.println("Entre" + n + "valores inteiros");
		for (c = 0; c < n; c++)
			array[c] = in.nextInt();
		for (c = 0; c < (n - 1); c++) {
			for (d = 0; d < n - c - 1; d++) {
				if (array[d] > array[d + 1]) {
					swap = array[d];
					array[d] = array[d + 1];
					array[d + 1] = swap;
				}
			}
		}
		System.out.println("Resultado");
		for (c = 0; c < n; c++)
			System.out.println(array[c]);
		
		in.close();

	}
	

}