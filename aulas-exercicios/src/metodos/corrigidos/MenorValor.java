package metodos.corrigidos;

public class MenorValor {
	public static void main(String[] args) {
		System.out.println(menor(1, 3));
		System.out.println(menor(4, 3));
		System.out.println(menor(3, 2));
		System.out.println(menor(10, 3));
		System.out.println(menor(1, 33));
		System.out.println(menor(22, 22));
		System.out.println(menor(22, 22.4f));
		System.out.println(menor("11", "32"));
		
	}
	
	public static int menor(int a, int b) {
		return a < b ? a : b;
	}
	
	public static float menor(float a, float b) {
		return a < b ? a : b;
	}
	
	public static double menor(double a, double b) {
		return a < b ? a : b;
	}
	
	public static String menor(String a, String b) {
		double aDouble = Double.parseDouble(a);
		double bDouble = Double.parseDouble(b);
		return aDouble < bDouble  ? a : b;
	}
}
