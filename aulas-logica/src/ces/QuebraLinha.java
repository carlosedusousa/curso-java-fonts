package ces;

public class QuebraLinha {

	public static void main(String[] args) {

		// Declara��o da vari�vel
		String texto = "O Nassor n�o sabe preparar aula";
		// Troca espa�o por quebra de linha
		String resultado = texto.replaceAll(" ", "\n");
		// Imprime com troca da letra R por nova linha 
		System.out.println(resultado);

	}

}
