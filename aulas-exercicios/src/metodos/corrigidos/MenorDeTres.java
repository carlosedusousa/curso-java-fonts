package metodos.corrigidos;

public class MenorDeTres {
	
	public static void main(String[] args) {
		System.out.println(menor(3, 4, 5));
		System.out.println(menor(5, 4, 3));
		System.out.println(menor(4, 5, 3));
		System.out.println(menor(4, 3, 5));
	}
	
	public static double menor(double a, double b, double c) {
		return Math.min(Math.min(a, b), c);
	}
}
