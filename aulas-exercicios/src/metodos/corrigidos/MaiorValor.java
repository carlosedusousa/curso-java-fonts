package metodos.corrigidos;

public class MaiorValor {

	public static void main(String[] args) {
		System.out.println(maior(1, 3));
		System.out.println(maior(4, 3));
		System.out.println(maior(3, 2));
		System.out.println(maior(10, 3));
		System.out.println(maior(1, 33));
		System.out.println(maior(22, 22));
		System.out.println(maior(22, 22.4f));
		System.out.println(maior("11", "32"));
		
	}
	
	public static int maior(int a, int b) {
		return a > b ? a : b;
	}
	
	public static float maior(float a, float b) {
		return a > b ? a : b;
	}
	
	public static double maior(double a, double b) {
		return a > b ? a : b;
	}
	
	public static String maior(String a, String b) {
		double aDouble = Double.parseDouble(a);
		double bDouble = Double.parseDouble(b);
		return aDouble  > bDouble  ? a : b;
	}

}
