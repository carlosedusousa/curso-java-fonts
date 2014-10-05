package ces;

public class EstudoArray {

	public static void main(String[] args) {

		/*
		 * int[] arr = new int[3]; arr[0] = 10; arr[1] = 20; arr[2] = 30;
		 * 
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]);
		 */

		// Define um array de String
		String[] listaNomes = new String[5];

		// Instancia valores no array
		listaNomes[0] = "Carlos";
		listaNomes[1] = "Eduardo";
		listaNomes[2] = "Passos";
		listaNomes[3] = "de";
		listaNomes[4] = "Sousa";

		int tamanhoLista = listaNomes.length;
		// Estudo for (la�o para imprimeir o array)
		for (int i = 0; i < tamanhoLista; i++) {

			System.out.println(listaNomes[i]);

		}

	}

}
