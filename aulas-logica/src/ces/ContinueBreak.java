package ces;

/*
 * As palavras-chave continue e break servem para gerar alterações em meio
 * a execução de um laço.
 * 
 * O "continue" faz que que o laço pule para próxima condição do laço.
 * O "break" interrempe a execução do laço.
 * 
 * Eles quase sempre são utilizados dentro de alguma condição específica. 
 */
public class ContinueBreak {

	public static void main(String[] args) {
		
		// Imprimir todos os número de 1 a 100 menos os pares
		// Se o número for maior que 35 parar a execução do programa
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			
			if(i > 35) {
				break;
			}
			
			System.out.print(i + " ");
		}
		
		int a = 0;
		
		while(true) {
			a++;
			
			if(a > 500) {
				break;
			}
			
			System.out.println(a);
			
		}

	}

}
