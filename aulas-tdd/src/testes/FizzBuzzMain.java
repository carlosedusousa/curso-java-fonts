package testes;

public class FizzBuzzMain {

	public static void main(String[] args) {

		FizzBuzz fb = new FizzBuzz();

		for (int i = 1; i <= 100; i++) {

//			System.out.println((i + " - " + (fb.divisivelPor(i) == "" ? i : fb
//					.divisivelPor(i))));
			
			System.out.println((i + " - " + fb
					.divisivelPor(i)));


		}

	}

}
