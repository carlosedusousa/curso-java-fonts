package oo.exemplos.exercicios;

public class TestarPorta {

	public static void main(String[] args) {

		Porta primeiraPorta = new Porta();
		Porta segundaPorta = new Porta();

		primeiraPorta.pinta("azul");
		System.out.println("A primeira porta � da cor "
				+ primeiraPorta.getCor());

		segundaPorta.pinta("verde");
		System.out.println("A segunda porta � da cor " 
				+ segundaPorta.getCor());

		primeiraPorta.setDimencaoX(2.47);
		primeiraPorta.setDimencaoY(1.43);
		primeiraPorta.setDimencaoZ(0.41);
		segundaPorta.setDimencaoX(2.89);
		segundaPorta.setDimencaoY(1.35);
		segundaPorta.setDimencaoZ(0.56);

		System.out.println("Dimens�o da primeira porta � X|Y|Z = "
				+ primeiraPorta.getDimencaoX() + " | "
				+ primeiraPorta.getDimencaoY() + " | "
				+ primeiraPorta.getDimencaoZ());

		System.out.println("Dimens�o da segunda porta � X|Y|Z = "
				+ segundaPorta.getDimencaoX() + " | "
				+ segundaPorta.getDimencaoY() + " | "
				+ segundaPorta.getDimencaoZ());

		primeiraPorta.abre();

		System.out.println("A primeira porta est� "
				+ (primeiraPorta.estaAberta() ? "Aberta" : "Fechada"));
		System.out.println("A segunda porta est� "
				+ (segundaPorta.estaAberta() ? "Aberta" : "Fechada"));
	}

}
