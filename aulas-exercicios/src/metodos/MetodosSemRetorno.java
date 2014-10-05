package metodos;

public class MetodosSemRetorno {

	public static void main(String[] args) {
		String strUm = "Métodos são mto divertidos";
		String strDois = ", mas talvez você não ache";
		
		concatenarEImprimir(strUm, strDois);
	}
	
	public static void concatenarEImprimir(String um, String dois) {
		String stringConcatenada = um + dois;
		System.out.println(stringConcatenada);
	}
}
