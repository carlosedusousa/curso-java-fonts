package semana2;

import java.util.Random;

public class SortearNumeros {

	public static void main(String[] args) {
		 Random gerador = new Random();
		 
		 for(int i = 0; i < 50; i++ ) {
			 int sorteado = gerador.nextInt(100) + 1;
			 System.out.println(sorteado);
		 }

	}

}
