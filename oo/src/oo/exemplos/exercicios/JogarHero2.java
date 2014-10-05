package oo.exemplos.exercicios;


public class JogarHero2 {

	public static void main(String[] args) {
		
		Hero2 giraia = new Hero2("Giraia", new Posicao(0,0), 100, 5, 6);
		Hero2 subZero = new Hero2("SubZero",new Posicao(0,0), 100, 4, 6);
		
		giraia.caminha("esquerda");
		subZero.corre("baixo");
	
	}

}
