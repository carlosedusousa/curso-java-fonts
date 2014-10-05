package ces;

public class OperadoresAritimeticos {

	public static void main(String[] args) {

		double x = 10;
		double y = 2;

		double soma = x + y;
		x = 10;
		double subtracao = x - y;
		x = 10;
		double multiplicacao = x * y;
		x = 10;
		double divisao = x / y;
		x = 10;
		double modulo = x % y;
		x = 10;
		double incrementa1 = x++;
		x = 10;
		double decrementa1 = x--;
		x = 10;
		double incrementa2 = x += 2;
		x = 10;
		double decrementa2 = x -= 2;
		x = 10;
		double multiplica2 = x * 2;
		x = 10;
		double divide2 = x /= 2;
		x = 10;
		double modulo2 = x %= 2;
		x = 10;

		System.out.println("soma=x+y > " + soma);
		System.out.println("subtracao = x-y > " + subtracao);
		System.out.println("multiplicacao = x*y > " + multiplicacao);
		System.out.println("divisao = x/y > " + divisao);
		System.out.println("modulo = x%y > " + modulo);
		System.out.println("incrementa1 = x++ > " + incrementa1);
		System.out.println("decrementa1 = x-- > " + decrementa1);
		System.out.println("incrementa2 = x+=2 > " + incrementa2);
		System.out.println("decrementa2 = x-=2 > " + decrementa2);
		System.out.println("multiplica2 = x*2 > " + multiplica2);
		System.out.println("divide2 = x/=2 > " + divide2);
		System.out.println("modulo2 = x%=2 > " + modulo2);

	}

}
