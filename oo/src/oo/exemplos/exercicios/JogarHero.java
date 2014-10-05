package oo.exemplos.exercicios;

public class JogarHero {

	public static void main(String[] args) {

		Hero giraia = new Hero("Giraia", 0, 100, 5, 6);
		Hero subZero = new Hero("SubZero", 0, 100, 4, 6);
		
		giraia.caminha();
		subZero.corre();
		giraia.caminha();
		subZero.corre();
		giraia.caminha();
		subZero.corre();
		giraia.caminha();
		subZero.corre();

		subZero.ataca(giraia);
		giraia.ataca(subZero);
		subZero.ataca(giraia);
		subZero.ataca(giraia);
		giraia.ataca(subZero);
		giraia.ataca(subZero);
		subZero.ataca(giraia);
		subZero.ataca(giraia);
		giraia.ataca(subZero);
		giraia.ataca(giraia);
		
		giraia.pocaoVida();
		giraia.pocaoVelocidade();
		giraia.corre();

		giraia.getVida();
		subZero.getVida();

	}

}
