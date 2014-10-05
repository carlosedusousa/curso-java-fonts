/*
 * Para cada conjunto de valores abaixo, escreva o c�digo Java,
usando la�o(s), que preencha um array com os valores:
a) 10 9 8 7 6 5 4 3 2 1
b) 0 1 4 9 16 25 36 49 64 81 100
c) 1 2 3 4 5 10 20 30 40 50
d) 3 4 7 12 19 28 39 52 67 84
 * */

package ces;

public class ArrayExercicios {

	public static void main(String[] args) {
		
		int i;

		int maisUm[] = new int[10];
		int taboada[] = new int [11];
		int umCinquenta [] = new int [10];
		int maisTres[] = new int [10];
		double a[] = new double [3];

		//a
		//Criando array de inteiros de 10 a 1.
		System.out.print("maisUm - ");
		//Atribunindo valores a uma posi��o do array.
		for(i=10; i>0; i-=1){
			maisUm[i - 1] = i;
			//Imprime o array.
			System.out.print(maisUm[i - 1] + " ");
		}
		
		//b
		//Criando array de inteiros de 1 a 11.
		System.out.print("\ntaboada - ");
		//Atribunindo valores a uma posi��o do array.		
		for(i=0; i<11; i+=1){
			taboada[i] = i*i;			
			//Imprime o array.			
			System.out.print(taboada[i] + " ");
		}
		
		//c
		//Criando array de inteiros multiplos de 5 e de 10.
		//Atribunindo valores a uma posi��o do array.
		for(i=0; i<5; i++ ){								
			umCinquenta[i] = i+1;
			umCinquenta[i+5] = (i+1)*10;
		}
		System.out.print("\numCinquenta - ");
		//Atribunindo valores a uma posi��o do array.
		for(i=0;i<10;i++){
			System.out.print(umCinquenta[i] + " ");
		}
		
		//d
		System.out.print("\nmaisTres - ");
		//Atribunindo valores a uma posi��o do array.
		for(i=0; i<10; i+=1){
			maisTres[i] = taboada[i]+3;
			//Imprime o array.
			System.out.print(maisTres[i] + " ");
		}
		
		//e
		System.out.print("\nX ");
		a[0] = 4.5;
		a[1] = 4.9;
		i=0;
		do{
			//Imprime o array.
			System.out.print(a[i] + " ");
			i++;
		}while(i<3);

	}

}
