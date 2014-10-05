package ces;

public class Aula2b {

	public static void main(String [] args){
		String nome = " PITAGORAS NOSTRADAMUS ";
		int idade = 99;
		float peso = 81.5f;
		
		char umaLetra = nome.charAt(1);
		int tamanho = nome.length();
		
		System.out.println("A \"idade\" da " + nome + " �: \"" + idade + "\", o peso �: " + peso + "Kg.");
		//Mostra letra na posi��o determinada
		System.out.println("\"" + umaLetra + "\"");
		System.out.println(tamanho);
		
		//Mostra string sem espa�o
		String SentenceWithoutSpace = nome.replace(" ", "");
		// Mostrar string com espa�o
		System.out.println(SentenceWithoutSpace);	
		// Mostrar os 3 primeiro caracteres da string
		System.out.println(SentenceWithoutSpace.substring(3));
		// Mostrar tamanho da string considerando espa�os
		System.out.println(SentenceWithoutSpace.length());
		// Trocar I por 1 , A por 4, S por 5 	
		String ReplaceAfor1 = nome.replace("I", "1" );
		ReplaceAfor1 = ReplaceAfor1.replace("A", "4" );
		ReplaceAfor1 = ReplaceAfor1.replace("S", "5" );
		System.out.println(ReplaceAfor1);
		
		
	}
}
