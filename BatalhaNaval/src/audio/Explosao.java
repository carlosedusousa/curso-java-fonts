package audio;

import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;

public class Explosao {

	final String explosao1 = "mp3/explosion1.mp3";
	final String explosao2 = "mp3/explosion2.mp3";

	public Explosao(int valor) throws FileNotFoundException, JavaLayerException{
		Som mp3;
		if (valor == 1){
			mp3 = new Som(explosao2);
			mp3.play();
		}
		else {
			mp3 = new Som(explosao1);
			mp3.play();
		}
	}
	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
		Explosao explosao = new Explosao(2);
	}
}