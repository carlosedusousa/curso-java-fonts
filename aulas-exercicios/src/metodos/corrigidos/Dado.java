package metodos.corrigidos;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			System.out.println(rolar());
		}
	}
	
	public static int rolar() {
		Random gerador = new Random();
		return gerador.nextInt(6) + 1;
	}

}
