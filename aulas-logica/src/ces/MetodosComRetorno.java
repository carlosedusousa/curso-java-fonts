package ces;

public class MetodosComRetorno {

	public static void main(String[] args) {
		String strUm = "Métodos são mto divertidos";
		String strDois = ", mas talvez você não ache";
		
		String concatenado = concatenar(strUm, strDois);
		
		String strTres = ". Mas que é, é!";
		
		concatenado = concatenar(concatenado, strTres);
		
//		String concatenado = strUm + strDois + strTres;
		System.out.println(concatenado);
		System.out.println(retornaMimimi());
		concatenarEImprimir(strUm, strDois);
	}
	
	public static String retornaMimimi() {
		return "Mimimi";
	}
	
	public static void concatenarEImprimir(String um, String dois) {
		String stringConcatenada = um + dois;
		System.out.println(stringConcatenada);
	}
	
	public static String concatenar(String um, String dois) {
		String stringConcatenada = um + dois;
		return stringConcatenada;
	}

}
