package metodos.corrigidos;

/*
 * A partir do nome completo, ex.: Nassor Paulino Silva, 
 * diga a quantidade de nomes de uma
 * pessoa.
 */
public class ProblemaProvaSistemas {

	public static void main(String[] args) {
		String nome = "Nassor Paulino Silva";
		
		String[] nomes = nome.split(" ");
		System.out.println("A quantidade de nomes �: " + nomes.length);
		
//		// Outra forma
//		int quantidadeNomes = 1;
//		for(int i = 0; i < nome.length(); i++) {
//			if(nome.charAt(i) == ' ') {
//				quantidadeNomes++;
//			}
//		}
//		
//		if(!nome.equals("")) {
//			System.out.println("A quantidade de nomes é: " + quantidadeNomes);
//		}
		
	}

}
