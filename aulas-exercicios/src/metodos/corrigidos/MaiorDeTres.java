package metodos.corrigidos;

public class MaiorDeTres {

	public static void main(String[] args) {
		System.out.println(maior(3, 4, 5));
		System.out.println(maior(5, 4, 3));
		System.out.println(maior(4, 5, 3));
		System.out.println(maior(4, 3, 5));
	}
	
	public static double maior(double a, double b, double c) {
		return MaiorValor.maior(MaiorValor.maior(a, b), c);
	}

}
