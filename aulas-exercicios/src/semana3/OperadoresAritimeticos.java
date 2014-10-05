package semana3;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int x = 10;
		
		
		
		
		
		System.out.println(x++);    // antes x == 10, depois x == 11
		System.out.println(x);
		System.out.println(x--);    // antes x == 11, depois x == 10
		System.out.println(x);
		System.out.println(++x);
		System.out.println(--x);
		
		// Operador ternário
		String tipo = x % 2 == 0 ? "par" : "impar";
		System.out.println(tipo);

	}

}
