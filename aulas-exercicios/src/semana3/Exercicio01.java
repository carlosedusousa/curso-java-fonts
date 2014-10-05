package semana3;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// A)
		// criando um array de inteiros de tamanho 10
		int[] arrayA = new int[10];
		
		// preenchendo valores dentro do array utilizando
		// o padrão: 10 9 8 7 6 5 4 3 2 1
		for(int i = 0; i < 10; i++) {
			// atribuindo um valor a uma posição do array
			arrayA[i] = 10 - i;
		}
		
		// Imprime os valores do arrayA para verificação
		System.out.print("a) ");
		for(int index = 0; index < 10; index++) {
			System.out.print(arrayA[index] + " "); 
		}
		
		// ----------------------------------------
		
		// B)
		// criando um array de inteiros de tamanho 10
		int[] arrayB = new int[11];
		
		// criando variável de controle
		int idx = 0;
		
		// preenchendo valores dentro do array utilizando
		// o padrão: 0 1 4 9 16 25 36 49 64 81 100
		while(idx < arrayB.length) {
			arrayB[idx] = idx * idx;
			idx++;
		}
		
		// zera novamente a variável de controle
		idx = 0;
		
		// Imprime os valores do arrayB para verificação
		System.out.print("\nb) ");
		while(idx < arrayA.length) {
			System.out.print(arrayA[idx] + " ");
			idx++;
		}
		
		// ----------------------------------------
		
		// C)
		// criando um array de inteiros de tamanho 10
		int[] arrayC = new int[10];
		
		// preenchendo e imprimindo os valores dentro do array utilizando
		// o padrão: 10 9 8 7 6 5 4 3 2 1
		System.out.print("\nc) ");
		for(int i = 0; i < 10; i++) {
			
			// verificando a posição é maior ou não que cinco
			if(i < 5) {
				arrayC[i] = i+1; // atribuindo os valores para abaixo da 5 posição
			} else {
				arrayC[i] = (i-4) * 10; // atribuindo os valores para acima da 6 posição
			}
			
			// Imprime o valor para a posição do array
			System.out.print(arrayC[i] + " ");
		}
		
		// ----------------------------------------
		
		// D)
		// criando um array de inteiros de tamanho 10
		int[] arrayD = new int[10];
		
		System.out.print("\nd) ");
		for(int i = 0; i < arrayD.length; i++) {
			// atribuindo os valores para o D
			arrayD[i] = arrayB[i] + 3;
			
			// Imprime o valor para a posição do array
			System.out.print(arrayD[i] + " ");
		}

	}

}
