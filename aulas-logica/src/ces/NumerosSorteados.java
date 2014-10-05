package ces;

	import java.util.Random;

	public class NumerosSorteados {

	    public static void main(String[] args) {

	    	// Instancia variavel.
	        int i = 0;
	        
	        // La�o de sorteio atraves de um gerador Random.
	        do{
	        	
	        Random gerador = new Random();
	       
	        int numero = gerador.nextInt(100) + 1;
	 
	        // Imprime valores sorteados at� completar 50 tentativas.
	        System.out.print(numero + " | ");
	       
	        i++;
	      
	        }while(i != 50);
	        
//	        System.out.println("\n" + i);
	    }

	}
	

